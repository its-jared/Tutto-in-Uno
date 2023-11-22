package core;

import app.Console;
import ui.Window;
import util.Debug;

public class Main {

	public static Debug debug;
	public static Window window;
	public static final String APPLICATION_NAME = "Tutto in Uno";
	public static final float APPLICATION_VERSION = 0.1f;
	
	public static void main(String[] args) {
		debug = new Debug();
		debug.log(APPLICATION_NAME + " - " + APPLICATION_VERSION);
		
		window = new Window();
		debug.log("Displaying window...");
		
		new Console(window.getDesktop().getDesktop());
	}

}
