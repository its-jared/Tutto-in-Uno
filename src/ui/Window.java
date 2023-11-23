package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import app.Console;
import app.ControlViewer;
import core.Main;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Window {

	private JFrame frame;
	private Desktop desktop;

	public Window() {
		initialize();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
		
		desktop = new Desktop(frame);
		
		new AppBar(this);
		
		new Console(this.getDesktop().getDesktop());
		new ControlViewer(this.getDesktop().getDesktop());
	}

}
