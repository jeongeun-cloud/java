package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.FlowLayout;

public class Ch09Ex03 extends MyFrame {
	
	public Ch09Ex03(String title) {
		super(title, 300, 300);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
		add(new Button("ok"));
	}
	
	public static void main(String[] args) {
		
		new Ch09Ex03("Flow Layout ����").setVisible(true);
	}

}
