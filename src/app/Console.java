package app;

import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import core.Main;
import ui.Desktop;
import util.Application;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

public class Console extends Application {

	public Console(JDesktopPane _desktop) {
		super(_desktop);
		
		super.desktop = _desktop;
		super.applicationName = "Console";
		super.applicationVersion = Main.APPLICATION_VERSION;
		
		build();
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
		super.applicationFrame.setVisible(true);
	}

}
