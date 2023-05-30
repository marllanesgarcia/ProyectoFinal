package main;

import javax.swing.SwingUtilities;

import clases.Batalla;
import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		
		Ventana v=new Ventana();
			
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                Batalla batalla = new Batalla();
	                batalla.iniciarBatalla();
	                batalla.setVisible(true);
	            }
	        });
	    }

		
	}

}
