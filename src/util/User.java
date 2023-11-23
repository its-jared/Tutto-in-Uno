package util;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;

import core.Main;

public class User {

	private final String USER_FILES_DIR = "user_files/";
	
	private String userName;
	private Ini userIni;
	private String userPath;
	private Ini userSettings;
	
	public User(String _userName) {
		userName = _userName;
		try {
			userIni = new Ini(new File(USER_FILES_DIR + userName + "/user_info.ini"));
			userPath = USER_FILES_DIR + userIni.get("userInfo", "userName");
			userSettings = new Ini(new File(userIni.get("userInfo", "userSettings").replace("USER", userPath)));
		} catch (IOException e) {
			e.printStackTrace();
			Main.debug.log("Unable to find the user info file!");
		}
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserPath() {
		return userPath;
	}
	
	public String getUserWallpaperPath() {
		return userSettings.get("desktop", "wallpaperPath").replace("USER", userPath);
	}
}
