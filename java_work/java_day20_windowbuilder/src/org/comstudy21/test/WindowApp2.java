package org.comstudy21.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class WindowApp2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowApp2 window = new WindowApp2();
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
	public WindowApp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774  \uB984 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(37, 13, 68, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544 \uC774 \uB514:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(37, 41, 68, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setBounds(37, 69, 68, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uB098  \uC774 :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2.setBounds(37, 97, 68, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(117, 10, 268, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(117, 38, 268, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(117, 66, 268, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(117, 94, 268, 21);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("\uAC00\uC785\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				String text1 = textField_1.getText();
				String text2 = textField_2.getText();
				String text3 = textField_3.getText();
				System.out.printf("%s, %s, %s, %s \n",text,text1,text2,text3);
				
				//textArea.append(text + ", " + text1 + ", " + text2 + ", " + text3 + "\n");
			}
		});
		btnNewButton.setBounds(101, 214, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB2E4\uC2DC\uC4F0\uAE30");
		btnNewButton_1.setBounds(226, 214, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(117, 125, 268, 79);
		frame.getContentPane().add(textArea);
	}
}
