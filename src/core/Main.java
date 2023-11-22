package core;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.pushingpixels.radiance.theming.api.skin.NightShadeSkin;
import org.pushingpixels.radiance.theming.api.skin.RadianceBusinessLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceCremeCoffeeLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteAquaLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceNebulaLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceNightShadeLookAndFeel;

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
		
		
		SwingUtilities.invokeLater(() -> {
	        try {
	          UIManager.setLookAndFeel(new RadianceNightShadeLookAndFeel());
	        } catch (Exception e) {
	          debug.log("Unable to init look and feel!");
	        }

	        window = new Window();
			debug.log("Displaying window...");
	    });
		
	}

}
