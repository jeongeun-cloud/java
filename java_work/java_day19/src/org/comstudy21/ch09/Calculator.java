package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator extends MyFrame{
	
	Button backbtn = new Button("��");
	Button cebtn = new Button("CE");
	Button cbtn = new Button("C");
	Button pmbtn = new Button("��");
	Button rootbtn = new Button("��");
	Button n7btn = new Button("7");
	Button n8btn = new Button("8");
	Button n9btn = new Button("9");
	Button divbtn = new Button("/");
	Button perbtn = new Button("%");
	Button n4btn = new Button("4");
	Button n5btn = new Button("5");
	Button n6btn = new Button("6");
	Button mulbtn = new Button("*");
	Button xbtn = new Button("1/x");
	Button n1btn = new Button("1");
	Button n2btn = new Button("2");
	Button n3btn = new Button("3");
	Button minusbtn = new Button("-");
	Button resbtn = new Button("=");
	Button n0btn = new Button("0");
	Button pointbtn = new Button(".");
	Button plusbtn = new Button("+");
	
	
	Panel panel = new Panel(new GridLayout(6, 5, 5, 5));
	Panel center = new Panel(new GridLayout());
	Label label = new Label("0", Label.RIGHT);

	
	public Calculator(String title) {
		super(title, 280, 320);
		
		label.setFont(new Font(null, Font.BOLD, 30));
		center.add(label);
		this.add("North",center);

		panel.add(backbtn);
		panel.add(cebtn);
		panel.add(cbtn);
		panel.add(pmbtn);
		panel.add(rootbtn);
		panel.add(n7btn);
		panel.add(n8btn);
		panel.add(n9btn);
		panel.add(divbtn);
		panel.add(perbtn);
		panel.add(n4btn);
		panel.add(n5btn);
		panel.add(n6btn);
		panel.add(mulbtn);
		panel.add(xbtn);
		panel.add(n1btn);
		panel.add(n2btn);
		panel.add(n3btn);
		panel.add(minusbtn);
		panel.add(resbtn);
		panel.add(n0btn);
		panel.add(pointbtn);
		panel.add(plusbtn);

		
		this.add("South", panel);
		
		play();

		setVisible(true);
	}
	
	class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() instanceof Button) {
				Button btn = (Button) e.getSource();
				Calculator.this.label.setText(btn.getLabel());
			}
		}
	}
	
	private void play() {
		ButtonHandler handler = new ButtonHandler();
		backbtn.addActionListener(handler);
		cebtn.addActionListener(handler);
		cbtn.addActionListener(handler);
		pmbtn.addActionListener(handler);
		rootbtn.addActionListener(handler);
		n7btn.addActionListener(handler);
		n8btn.addActionListener(handler);
		n9btn.addActionListener(handler);
		divbtn.addActionListener(handler);
		perbtn.addActionListener(handler);
		n4btn.addActionListener(handler);
		n5btn.addActionListener(handler);
		n6btn.addActionListener(handler);
		mulbtn.addActionListener(handler);
		xbtn.addActionListener(handler);
		n1btn.addActionListener(handler);
		n2btn.addActionListener(handler);
		n3btn.addActionListener(handler);
		minusbtn.addActionListener(handler);
		resbtn.addActionListener(handler);
		n0btn.addActionListener(handler);
		pointbtn.addActionListener(handler);
		plusbtn.addActionListener(handler);

	}


	public static void main(String[] args) {
		new Calculator("����");
	}
	
}
