package util;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import core.Main;

public class Application {
	
	protected String applicationName;
	protected float applicationVersion;
	protected JInternalFrame applicationFrame;
	protected ImageIcon applicationIcon;
	protected JDesktopPane desktop;
	
	public Application(JDesktopPane _desktop) {
		desktop = _desktop;
	}
	
	public String getApplicationName() {
		return applicationName;
	}
	
	public ImageIcon getAppIcon() {
		return applicationIcon;
	}
	
	public void build() {
		Main.debug.log("No override made to the build function!");
		desktop.add(applicationFrame);
	}
	
}
