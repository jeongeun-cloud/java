package homework;

import java.awt.Button;

import org.comstudy21.ch09.MyFrame;

public class MyCalc2 extends MyFrame {
	Button[] btns = new Button[12];

	public MyCalc2() {
		setLayout(null); // 기본 레이아웃 매니저를 제거한다.
		
		for(int i=0; i<btns.length; i++) {
			btns[i] = new Button(""+i);
			add(btns[i]);
		}
		int x = 20;
		int y = 100;
		for(int i=1; i<btns.length; i++) {
			if(i == 10) {
				btns[i].setBounds(x, y, 83, 25);
				x += 43;
			} else {
				btns[i].setBounds(x, y, 40, 25);
			}
			x += 43;
			if(i%3 == 0 && i != 0) {
				x = 20;
				y += 28;
			}
		}
		//btns[0].setBounds(x, y, 40, 25);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyCalc2();
	}
}
