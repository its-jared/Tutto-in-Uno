package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.border.Border;

import core.Main;

public class Desktop {

	private JDesktopPane desktop;
	private BufferedImage image;
	
	public Desktop(JFrame window) {
		try {
			image = ImageIO.read(new File(Main.currentUser.getUserWallpaperPath()));
		} catch (IOException e) {
			e.printStackTrace();
			Main.debug.log("Unable to set wallpaper!");
		}
		
		desktop = new JDesktopPane() {
			@Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(image, 0, 0, desktop.getWidth(), desktop.getHeight(), null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(desktop.getWidth(), desktop.getHeight());
            }
		};
		window.getContentPane().add(desktop, BorderLayout.CENTER);
	}
	
	public JDesktopPane getDesktop() {
		return desktop;
	}
}
