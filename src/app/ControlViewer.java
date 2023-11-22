package app;

import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;

import core.Main;
import util.Application;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteAquaLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteChalkLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteElectricLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteGlassLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteGoldLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteSiennaLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceGraphiteSunsetLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceMagellanLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceNightShadeLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceRavenLookAndFeel;
import org.pushingpixels.radiance.theming.api.skin.RadianceTwilightLookAndFeel;

import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlViewer extends Application {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	public ControlViewer(JDesktopPane _desktop) {
		super(_desktop);
		
		super.desktop = _desktop;
		super.applicationName = "Control Viwer";
		super.applicationVersion = 1.0f;
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	protected void build() {
		Main.debug.log("Building " + super.applicationName + "...");
		
		JInternalFrame internalFrame = new JInternalFrame(super.applicationName);
		try {
			internalFrame.setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		internalFrame.setResizable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setClosable(true);
		internalFrame.setBounds(100, 100, 499, 1262);
		super.applicationFrame = internalFrame;
		
		
		super.desktop.add(internalFrame);
		internalFrame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		internalFrame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Control Viewer");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Label");
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("New label");
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Text Field");
		lblNewLabel_2_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Combo Box");
		lblNewLabel_2_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"One", "Two", "Three", "Dark", "Light", "English", "Italiano"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				desktop.setVisible(false);
				
				try {
					switch (comboBox_1.getSelectedIndex()) {
						case 0: UIManager.setLookAndFeel(new RadianceTwilightLookAndFeel()); break;
						case 1: UIManager.setLookAndFeel(new RadianceNightShadeLookAndFeel()); break;
						case 2: UIManager.setLookAndFeel(new RadianceMagellanLookAndFeel()); break;
						case 3: UIManager.setLookAndFeel(new RadianceGraphiteLookAndFeel()); break;
						case 4: UIManager.setLookAndFeel(new RadianceGraphiteChalkLookAndFeel()); break;
						case 5: UIManager.setLookAndFeel(new RadianceGraphiteAquaLookAndFeel()); break;
						case 6: UIManager.setLookAndFeel(new RadianceGraphiteElectricLookAndFeel()); break;
						case 7: UIManager.setLookAndFeel(new RadianceGraphiteGoldLookAndFeel()); break;
						case 8: UIManager.setLookAndFeel(new RadianceGraphiteSiennaLookAndFeel()); break;
						case 9: UIManager.setLookAndFeel(new RadianceGraphiteSunsetLookAndFeel()); break;
						case 10: UIManager.setLookAndFeel(new RadianceGraphiteGlassLookAndFeel()); break;
						case 11: UIManager.setLookAndFeel(new RadianceRavenLookAndFeel()); break;
					}
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				
				desktop.setVisible(true);
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Twilight", "Night Shade", "Magellan", "Graphite", "Graphite Chalk", "Graphite Aqua", "Graphite Electric ", "Graphite Gold", "Graphite Sienna", "Graphite Sunset", "Graphite Glass", "Raven"}));
		comboBox_1.setSelectedIndex(1);
		comboBox_1.setToolTipText("Look and Feel");
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Button");
		lblNewLabel_2_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("New button");
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Check Box");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Radio Button");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Toggle Button");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Text Area");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("Formatted Text Field");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1 = new JLabel("Password Field");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		passwordField = new JPasswordField();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Text Pane");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JTextPane textPane = new JTextPane();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Editor Pane");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JEditorPane editorPane = new JEditorPane();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Spinner");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Table");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Tree");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JTree tree = new JTree();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Progress Bar");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JProgressBar progressBar = new JProgressBar();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Scroll Bar");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Separator");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Slider");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JSlider slider = new JSlider();
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Information Dialog Box");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktop, "Information Dialog", "OptionDialog", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Warning Dialog Box");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1 = new JButton("Show");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktop, "Warning Dialog", "OptionDialog", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Question Dialog Box");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton_2 = new JButton("Show");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktop, "Question Dialog", "OptionDialog", JOptionPane.QUESTION_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Error Dialog Box");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton_3 = new JButton("Show");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(desktop, "Error Dialog", "OptionDialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Popup Menu");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		JButton btnNewButton_3_1 = new JButton("Show");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(comboBox, 0, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1, 0, 230, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tglbtnNewToggleButton, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(formattedTextField, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tree, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(slider, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxNewCheckBox))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(tglbtnNewToggleButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(editorPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(tree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_1))
					.addContainerGap(1093, Short.MAX_VALUE))
		);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnNewButton_3_1, popupMenu);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		popupMenu.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("New menu");
		popupMenu.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("New menu");
		mnNewMenu_5.add(mnNewMenu_6);
		panel.setLayout(gl_panel);
		
		JMenuBar menuBar = new JMenuBar();
		internalFrame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu_1.add(chckbxmntmNewCheckItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		mnNewMenu_1.add(rdbtnmntmNewRadioItem);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);
		super.applicationFrame.setVisible(true);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
