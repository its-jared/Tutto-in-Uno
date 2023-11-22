package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import app.Console;
import core.Main;

public class Window {

	private JFrame frame;
	private Desktop desktop;

	public Window() {
		initialize();
	}
	
	public JFrame getWindow() {
		return frame;
	}
	
	public Desktop getDesktop() {
		return desktop;
	}

	private void initialize() {
		frame = new JFrame(Main.APPLICATION_NAME);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		desktop = new Desktop(frame);
	}

}
