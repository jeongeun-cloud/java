package org.comstudy21.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameExam extends JFrame {
	JPanel contentPane;
	JLabel label = new JLabel("����");
	JTextField txt = new JTextField(10);
	JButton btn = new JButton("Ȯ��");
	
	JPanel p = new JPanel(new FlowLayout());
	
	public JFrameExam() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE �ڿ��� �� �ݳ� �� close		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ��������
		
		contentPane = (JPanel)getContentPane();
		
		p.add(label);
		p.add(txt);
		p.add(btn);
		
		setLayout(new BorderLayout());
		contentPane.add(BorderLayout.NORTH, p);
		
		
		ImageIcon image = new ImageIcon("capture.png");
		JLabel imgLabel = new JLabel(image);
		contentPane.add(imgLabel);
		
		setSize(400,380);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JFrameExam();

	}

}