package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Desktop {

	private JDesktopPane desktop;
	
	public Desktop(JFrame window) {
		desktop = new JDesktopPane();
		desktop.setBackground(new Color(0, 0, 255));
		window.getContentPane().add(desktop, BorderLayout.CENTER);
	}
	
	public JDesktopPane getDesktop() {
		return desktop;
	}
}
