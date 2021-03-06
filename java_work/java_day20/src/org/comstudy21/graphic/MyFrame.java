package org.comstudy21.graphic;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	
	public MyFrame() {
		this("MyFrame");
	}

	public MyFrame(String title) {
		this(title, 480, 320);
	}
	
	public MyFrame(String title, int width, int height) {
		super(title);
		setSize(width, height);
		
		// 창을 정 가운데 배치하기 
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screen.width / 2 - this.getWidth()/2;
		int y = screen.height / 2 - this.getHeight()/2;
		setLocation(x,y);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new MyFrame("java", 640, 400).setVisible(true);

	}
	
}
