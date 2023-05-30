package main;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.SwingUtilities;

import clases.Arma;
import clases.Batalla;
import clases.Jugador;
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
	    
	
		try {
			ArrayList<Arma> arma = Jugador.getTodos();
			 for (Arma a : arma) {
	    	        System.out.println("Nombre: " + a.getNombre() + ", Fuerza: " + a.getFuerza() + ", Peso: " + a.getPeso()); 
			 }
	    	    
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	
	}

		
	}


