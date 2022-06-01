package clients;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundFx {
	private Clip clip;
	
	public void sound (String soundName) {
		if (soundName != null) {
			try 
			   {
				File soundFile = new File (soundName);
			    AudioInputStream audioInputStream = AudioSystem
			    		.getAudioInputStream(soundFile.getAbsoluteFile( ));
			    clip = AudioSystem.getClip( );
			    clip.open(audioInputStream);
			    clip.start( );
			   }
			   catch(Exception ex)
			   {
			     System.out.println("Error with playing sound.");
			     ex.printStackTrace( );
			   }
			}
		}
}
