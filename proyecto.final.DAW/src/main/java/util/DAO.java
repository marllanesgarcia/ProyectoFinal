package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import clases.Arma;
import enums.Elemento;
import enums.Region;
import enums.Talento;

public abstract class DAO {

	private static Connection conexion;
	
	private static Statement conectar() { 
		
		try {
		BufferedReader lector=new BufferedReader(new FileReader("./bdconfig.ini"));
		String ip=lector.readLine();
		int puerto=Integer.parseInt(lector.readLine());
		String nombreBD=lector.readLine();
		String user=lector.readLine();
		String password=lector.readLine();
		lector.close();
		conexion=DriverManager.getConnection(
				"jdbc:mysql://"+ip+":"+puerto+"/"+nombreBD, user, password);
			return conexion.createStatement();
		
		}catch (SQLException e) {
		e.printStackTrace();
				return null;
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	
	private static void desconectar(Statement s) {
		
		try {
			s.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int insertar(String tabla, HashMap<String,Object> columnas) throws SQLException {
		Statement smt=conectar();
		
		String consulta="insert into "+ tabla + " (";
		Iterator it=columnas.keySet().iterator();
		while (it.hasNext()) {
			consulta+=(String)it.next()+",";
		}
			
		consulta=consulta.substring(0,consulta.length()-1);
		consulta+=") values ("; 
		it=columnas.values().iterator();
		while (it.hasNext()) {
			Object elemento=it.next();
			System.out.println(elemento.getClass());
			// poner una excepcion para que, cuando la clase sea distinta de String y de class, me ponga comillas menos los numeros
			if(elemento.getClass()!=String.class&&elemento.getClass()!=Character.class&&elemento.getClass()!=Arma.class&&
					elemento.getClass()!=java.lang.Float.class&&elemento.getClass()!=Elemento.class&&elemento.getClass()!=Talento.class&&elemento.getClass()!=Region.class) { 
				consulta+=elemento+",";
			} else {
				consulta+= "'"+elemento+"',";
				}
			}
		consulta=consulta.substring(0,consulta.length()-1);
		consulta+=")";	
		
		if(Config.verboseMode) {
			System.out.println(consulta);
		}
		
		int ret=smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}
	
	
	
	public static int borrar(String tabla, HashMap<String, Object> columnasBorrar) throws SQLException {
		Statement smt=conectar();
		String consulta="delete from "+tabla+" where ";
		Iterator it=columnasBorrar.entrySet().iterator();
		while (it.hasNext()) {
			Entry actual=(Entry)it.next();
			if(actual.getValue().getClass()!=String.class&&actual.getValue().getClass()!=Character.class) { 
				consulta+=(String)actual.getKey()+"="+(String)actual.getValue()+" and ";
			}else {
				consulta+=(String)actual.getKey()+"='"+(String)actual.getValue()+"' and ";
			}
		}
		consulta=consulta.substring(0,consulta.length()-5);

		if(Config.verboseMode) {
			System.out.println(consulta);
		}
		
		int ret=smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}
	
	public static ArrayList<Object> consultar(String query) throws SQLException{
			
			Statement smt=conectar();
			ResultSet cursor=smt.executeQuery(query);
			ArrayList<Object> fila=new ArrayList<Object>();
			while(cursor.next()) {  //
				String emailQ=cursor.getString(cursor.findColumn("email"));
				String contraseñaQ=cursor.getString(cursor.findColumn("password"));
				String nombreQ=cursor.getString(cursor.findColumn("nombre"));
				
				fila.add(emailQ);
				fila.add(contraseñaQ);
				fila.add(nombreQ);
				
			}
			desconectar(smt);			
			return fila;
	}
	
	public static ArrayList<Object> consultar(String tabla, LinkedHashSet<String> columnasSelect, HashMap<String, Object> restricciones) throws SQLException{
		Statement smt=conectar();
		
		String query="select ";
		Iterator ith=columnasSelect.iterator();
		while(ith.hasNext()) {
			query+=(String)ith.next()+",";
		}
		query=query.substring(0,query.length()-1)+" from "+tabla+(restricciones.size()>0?" where ":"");   
		Iterator itm=restricciones.entrySet().iterator();
		while (itm.hasNext()) {
			Entry actual=(Entry)itm.next();
			if(actual.getValue().getClass()!=String.class&&actual.getValue().getClass()!=Character.class) { 
				query+=(String)actual.getKey()+"="+(String)actual.getValue()+" and ";
			}else {
				query+=(String)actual.getKey()+"='"+(String)actual.getValue()+"' and ";
			}
		}
		if(restricciones.size()>0) {
			query=query.substring(0,query.length()-5);
		}
		System.out.println(query);
		
		ResultSet cursor=smt.executeQuery(query);
		ArrayList<Object> fila=new ArrayList<Object>();
		while(cursor.next()) {  
			Iterator hsCols=columnasSelect.iterator();
			while(hsCols.hasNext()) {
				String nombreCol=(String)hsCols.next();
				try{
					fila.add(cursor.getInt(cursor.findColumn(nombreCol)));
				}catch(SQLException | NumberFormatException e) {
					fila.add(cursor.getString(cursor.findColumn(nombreCol)));
				}
			}
		}
		desconectar(smt);			
		return fila;
}

	
	public static int actualizar(String tabla, HashMap<String,Object> datosModificar,HashMap<String,Object> restricciones) throws SQLException {
		String query="update "+tabla+" set ";
		Iterator itm= datosModificar.entrySet().iterator();
		while (itm.hasNext()) {
			Entry actual=(Entry)itm.next();
			if(actual.getValue().getClass()!=String.class&&actual.getValue().getClass()!=Character.class) { 
				query+=actual.getKey()+" = "+actual.getValue()+",";
			}else {
				query+=actual.getKey()+" = '"+actual.getValue()+"',";
			}
		}
		query=query.substring(0,query.length()-1)+" where ";
				
		Iterator itr= restricciones.entrySet().iterator();
		while (itr.hasNext()) {
			Entry actual=(Entry)itr.next();
			if(actual.getValue().getClass()!=String.class&&actual.getValue().getClass()!=Character.class) { 
				query+=actual.getKey()+" = "+actual.getValue()+" and ";
			}else {
				query+=actual.getKey()+" = '"+actual.getValue()+"' and "; // el -5 de despues es de la cantidad de espacios de este and
			}
			
		}
		
		query=query.substring(0,query.length()-5);
		
		Statement smt=conectar();
		
		int ret=smt.executeUpdate(query);
		desconectar(smt);
		
		return ret;
		
	}
	
	
}
