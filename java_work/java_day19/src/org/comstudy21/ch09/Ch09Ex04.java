package org.comstudy21.ch09;

import java.awt.BorderLayout;
import java.awt.Button;

public class Ch09Ex04 extends MyFrame {
	// ������Ʈ�� �̺�Ʈ ó���� ���� �ʵ�� �����Ѵ�.
	Button btn01 = new Button("����");
	Button btn02 = new Button("����");
	Button btn03 = new Button("����");
	Button btn04 = new Button("����");
	Button btn05 = new Button("�߾�");
	
	public Ch09Ex04() {
		// �������� �⺻ ��ġ�����ڴ� BorderLayout�̴�.
		// ���ڿ�, ��� ��� ���� �� �� �ִ�.
		//add("North", btn01);  // �̷�������
		add(BorderLayout.NORTH, btn01);
		add(BorderLayout.SOUTH, btn02);
		add(BorderLayout.EAST, btn03);
		add(BorderLayout.WEST, btn04);
		add(BorderLayout.CENTER, btn05);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ch09Ex04();
	}

}