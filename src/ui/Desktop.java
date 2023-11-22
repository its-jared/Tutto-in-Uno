package ui;

import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Desktop {

	private JDesktopPane desktop;
	
	public Desktop(JFrame window) {
		desktop = new JDesktopPane();
		desktop.setBackground(new Color(0, 0, 255));
		window.add(desktop);
	}
	
	public JDesktopPane getDesktop() {
		return desktop;
	}
	
}
