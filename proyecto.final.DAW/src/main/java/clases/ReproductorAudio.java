package clases;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class ReproductorAudio {
    private Clip clip;

    public static void reproducir() {
    	try {
            File archivoMusica = new File("/musicaPrincipal.mp3");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoMusica);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
}

}