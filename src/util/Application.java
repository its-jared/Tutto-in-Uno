package util;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import core.Main;
import ui.Desktop;

public class Application {
	
	protected String applicationName;
	protected float applicationVersion;
	protected JInternalFrame applicationFrame;
	protected JDesktopPane desktop;
	
	public Application(JDesktopPane _desktop) {
		desktop = _desktop;
	}
	
	protected void build() {
		Main.debug.log("No override made to the build function!");
		desktop.add(applicationFrame);
	}
	
}
