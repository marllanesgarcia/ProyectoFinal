package clases;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class ReproductorAudio {
    private static Clip clip;

    public static void reproducir() {
    	try {
            File archivoMusica = new File("src/main/java/audios/musicaPrincipal.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
    
       
	    public static void reproducir(String rutaArchivo) {
	        try {
	            if (clip != null && clip.isRunning()) {
	                clip.stop();
	            }
	            
	            File archivoMusica = new File(rutaArchivo);
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
	            clip = AudioSystem.getClip();
	            clip.open(audioInputStream);
	            clip.start();
	        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
	            e.printStackTrace();
	        }
	    }
    
    	 public static void reproduciroOtro() {
    	    	try {
    	            File archivoMusica = new File("src/main/java/audios/medioChill.wav");
    	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
    	            Clip clip = AudioSystem.getClip();
    	            clip.open(audioInputStream);
    	            clip.start();
    	        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
    	            e.printStackTrace();
    	        }
    	 }
    	 public static void reproduciroBatalla() {
 	    	try {
 	            File archivoMusica = new File("src/main/java/audios/musicaBatalla.wav");
 	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
 	            Clip clip = AudioSystem.getClip();
 	            clip.open(audioInputStream);
 	            clip.start();
 	        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
 	            e.printStackTrace();
 	        }
}
    	 public static void reproducirPreguntas() {
  	    	try {
  	            File archivoMusica = new File("src/main/java/audios/musicaPreguntas.wav");
  	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
  	            Clip clip = AudioSystem.getClip();
  	            clip.open(audioInputStream);
  	            clip.start();
  	        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
  	            e.printStackTrace();
  	        }
 }

}