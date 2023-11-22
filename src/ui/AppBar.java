package ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.AppBarApplication;

public class AppBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Desktop desktop;
	private List<AppBarApplication> apps = new ArrayList<AppBarApplication>();
	
	public AppBar(Desktop _desktop) {
		desktop = _desktop;
	
	}
}

class AppBarButton extends JButton {

	private static final long serialVersionUID = -1949819407630720360L;
	
	private AppBarApplication app;
	
	public AppBarButton(AppBarApplication _app) {
		app = _app;
		
		super.setText(app.applicationName);
	}
}