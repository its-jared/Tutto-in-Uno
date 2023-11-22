package util;

import java.util.ArrayList;
import java.util.List;

public class Debug {

	private List<String> logs = new ArrayList<String>();
	
	public void log(String message) {
		System.out.println("DEBUG: " + message);
		logs.add(message);
	}
	
	public List<String> getLogs() {
		return logs;
	}
	
}
