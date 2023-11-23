package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.text.Utilities;

import app.Console;
import app.ControlViewer;
import core.Main;
import util.AppBarApplication;
import javax.swing.SwingConstants;

public class AppBar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Window desktop;
	private List<AppBarApplication> apps = new ArrayList<AppBarApplication>();
	
	public AppBar(Window _desktop) {
		desktop = _desktop;
		
		build();
		config();
		desktop.getWindow().getContentPane().add(this, BorderLayout.SOUTH);
	}
	
	private void config() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	}
	
	private void build() {	
		AppBarActionButton quitButton = new AppBarActionButton("Quit", "icons/actions/panel-force-quit.png", new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int responce = JOptionPane.showInternalConfirmDialog(desktop.getDesktop().getDesktop(), "Are you sure you'd like to quit?", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (responce == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(quitButton);
		
		AppBarActionButton logOutButton = new AppBarActionButton("Log out", "icons/actions/system-log-out.png", new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int responce = JOptionPane.showInternalConfirmDialog(desktop.getDesktop().getDesktop(), "Are you sure you'd like to log out?", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (responce == JOptionPane.YES_OPTION) {
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		add(logOutButton);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(JSeparator.VERTICAL);
		separator.setPreferredSize(new Dimension(1, 48));
		add(separator);
		
		Console console = new Console(desktop.getDesktop().getDesktop());
		apps.add(new AppBarApplication(console.getApplicationName(), console));
		
		ControlViewer controlViewer = new ControlViewer(desktop.getDesktop().getDesktop());
		apps.add(new AppBarApplication(controlViewer.getApplicationName(), controlViewer));
		
		for (int i = 0; i < apps.size(); i++) {
			AppBarButton appBarButton = new AppBarButton(apps.get(i));
			add(appBarButton);
		}
	}
}

class AppBarButton extends JButton {

	private static final long serialVersionUID = -1949819407630720360L;
	
	private AppBarApplication app;
	
	public AppBarButton(AppBarApplication _app) {
		app = _app;
		
		setToolTipText(app.applicationName);
		setIcon(app.application.getAppIcon());
		setBackground(new Color(0, 0, 0, 0));
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Main.debug.log("Opening - " + app.applicationName + "...");
				app.application.build();				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {				
			}

			@Override
			public void mouseExited(MouseEvent e) {				
			}
		});
	}
}

class AppBarActionButton extends JButton {
	
	private static final long serialVersionUID = 1L;
	
	public AppBarActionButton(String actionName, String appIconPath, MouseListener onClick) {
		setToolTipText(actionName);
		setIcon(new ImageIcon(appIconPath));
		setBackground(new Color(0, 0, 0, 0));
		
		addMouseListener(onClick);
	}
	
}