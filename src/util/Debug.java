package util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import ui.Desktop;

public class Debug {

	private List<String> logs = new ArrayList<String>();
	
	public void log(String message) {
		System.out.println("DEBUG: " + message);
		logs.add(message);
	}
	
	public void error(String message, Desktop desktop) {
		System.out.println("ERROR: " + message);
		logs.add("ERR: " + message);
		JOptionPane.showInternalMessageDialog(desktop.getDesktop(), message, "Error!", JOptionPane.ERROR_MESSAGE);
	}
	
	public List<String> getLogs() {
		return logs;
	}
	
}
