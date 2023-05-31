package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.SwingUtilities;

import clases.Arma;
import clases.Batalla;
import clases.Enemigo;
import clases.Jugador;
import interfaces.PantallaBatalla;
import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		
		Ventana v=new Ventana();
			
//	       SwingUtilities.invokeLater(new Runnable() {
//	            @Override
//	            public void run() {
//	                Batalla batalla = new Batalla();
//	                batalla.iniciarBatalla();
//	                batalla.setVisible(true);
//	            }
//	        });
	    
		System.out.println();
//		
//		try {
//	        String ultimoJugador = PantallaBatalla.getUltimoJugador();
//	        System.out.println("¡Hola, : " + ultimoJugador+" !");
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
		
		System.out.println();
		
		try {
			ArrayList<Arma> arma = Jugador.getTodos();
			 for (Arma a : arma) {
	    	        System.out.println("Nombre: " + a.getNombre() + ", Fuerza: " + a.getFuerza() + ", Peso: " + a.getPeso()); 
			 }
	    	    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			ArrayList<Enemigo> enemigo = Enemigo.getTodos();
			 for (Enemigo a : enemigo) {
	    	        System.out.println("Nombre: " + a.getNombre() + ", Vida: " + a.getVida()+ ", Elemento: " + a.getElemento()
	    	        +", Fuerza: " + a.getFuerza()); 
			 }
	    	    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
	}


