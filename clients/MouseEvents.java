package clients;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.UIManager;

public class MouseEvents implements MouseListener {
	  private JButton btnName;

		public MouseEvents(JButton btn) {
		// TODO Auto-generated constructor stub
			btnName = btn;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		btnName.setBackground(new Color(156, 210, 240));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		btnName.setBackground(UIManager.getColor("control"));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}