package org.comstudy21.ch09;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonHandler implements ActionListener {
	Ch09Ex09 window;
	
	// 라벨이 바뀌게 하기 위해서는 (클래스를 밖으로 빼냈을 때)
	// ButtonHandler(this)객체로 보내고 생성자를 생성해서 받은 후 actionPerformed
	public ButtonHandler(Ch09Ex09 window) {
		this.window = window; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			//System.out.println(btn.getLabel() + " 버튼 눌렀다!");
			window.label.setText(btn.getLabel() + " 버튼 눌렀다!");
		}	
	}
}

public class Ch09Ex09 extends MyFrame {
	Button playBtn = new Button("Play");
	Button stopBtn = new Button("Stop");
	Button nextBtn = new Button("Next");
	Button prevBtn = new Button("Prev");
	
	Label label = new Label("버튼을 눌러주세요!");
	
	Panel panel = new Panel(new GridLayout(1, 3, 0, 5));
	Panel panel2 = new Panel(new GridLayout(2, 1, 5, 0));
	Panel center = new Panel(new GridBagLayout());
	
	public Ch09Ex09() {
		panel.add(playBtn);
		panel.add(stopBtn);
		panel.add(panel2);
		panel2.add(nextBtn);
		panel2.add(prevBtn);
		
		this.add("South", panel);
		
		center.add(label);
		this.add("Center", center);
		
		play();
		
		setVisible(true);
	}
	
	private void play() {
		ButtonHandler handler = new ButtonHandler(this);
		playBtn.addActionListener(handler);
		stopBtn.addActionListener(handler);
		nextBtn.addActionListener(handler);
		prevBtn.addActionListener(handler);
	}

	public static void main(String[] args) {
		new Ch09Ex09();
	}


}
