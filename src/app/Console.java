package app;

import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;

import core.Main;
import util.Application;
import java.awt.GridLayout;
import java.awt.Font;

public class Console extends Application {

	public Console(JDesktopPane _desktop) {
		super(_desktop);
		
		super.desktop = _desktop;
		super.applicationName = "Console";
		super.applicationVersion = Main.APPLICATION_VERSION;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	protected void build() {
		Main.debug.log("Building " + super.applicationName + "...");
		
		JInternalFrame internalFrame = new JInternalFrame(super.applicationName);
		try {
			internalFrame.setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		internalFrame.setResizable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setClosable(true);
		internalFrame.setBounds(100, 100, 450, 300);
		super.applicationFrame = internalFrame;
		
		
		super.desktop.add(internalFrame);
		internalFrame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JTextPane txtpnThisIsSome = new JTextPane();
		txtpnThisIsSome.setEditable(false);
		txtpnThisIsSome.setText("sdgsgg");
		txtpnThisIsSome.setFont(new Font("Monospaced", Font.PLAIN, 12));
		internalFrame.getContentPane().add(txtpnThisIsSome);
		super.applicationFrame.setVisible(true);
	}
}
