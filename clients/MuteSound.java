package clients;

import javax.swing.JButton;

public class MuteSound {
	public Boolean MUTED;
	private String MUTE;
	public String CHECKFX = "check_fx.wav";
	public String CLEARFX = "clear_fx.wav";
	
	public void mute (JButton button) {
		if (MUTED == null) {
			MUTED = false;
		}
		
		if (MUTED == false) {
			CHECKFX = null;
			CLEARFX = null;
			MUTE = "Unmute";
			button.setText(MUTE);
			
		} else {
			CHECKFX = "check_fx.wav";
			CLEARFX = "clear_fx.wav";
			MUTE = "Mute";
			button.setText(MUTE);
		}
		MUTED = !MUTED;
	}

}
