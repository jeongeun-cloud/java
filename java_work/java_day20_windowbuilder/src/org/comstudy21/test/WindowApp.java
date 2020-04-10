package org.comstudy21.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class WindowApp {

	private JFrame frame;
	private JTextField txtTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowApp window = new WindowApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnBtn = new JButton("Btn1");
		panel.add(btnBtn);
		
		JButton btnBtn_1 = new JButton("Btn2");
		panel.add(btnBtn_1);
		
		JLabel lblSearch = new JLabel("search");
		panel.add(lblSearch);
		
		txtTextField = new JTextField();
		txtTextField.setText("text field");
		panel.add(txtTextField);
		txtTextField.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		panel.add(toolBar);
		
		JComboBox comboBox = new JComboBox();
		toolBar.add(comboBox);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmMenu_1 = new JMenuItem("menu1");
		menuBar.add(mntmMenu_1);
		
		JMenuItem mntmMenu = new JMenuItem("menu2");
		menuBar.add(mntmMenu);
		
		JMenuItem mntmMenu_2 = new JMenuItem("menu3");
		menuBar.add(mntmMenu_2);
		
		JMenuItem mntmMenu_3 = new JMenuItem("menu4");
		menuBar.add(mntmMenu_3);
	}

}
