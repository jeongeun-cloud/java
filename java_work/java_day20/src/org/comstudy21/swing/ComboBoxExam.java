package org.comstudy21.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComboBoxExam extends JFrame implements ListSelectionListener {
	JList list;
	JTextField tf;
	
	public ComboBoxExam() {
		String[] str = {"���", "���弭��", "����", "����", "����", "��ȭ"};
		list = new JList(str);
		
		add(new JLabel("��̸� �����Ͻÿ�."), "North");
		add(list); // �⺻ �� = Center
				
		tf = new JTextField();
		add(tf, "South");
		
		list.addListSelectionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 300);
		setVisible(true);
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object[] item;
		String total = "";
		
		if(e.getSource() instanceof JList) {
			JList lis = (JList)e.getSource();
			item = lis.getSelectedValues();
			
			for(int i=0; i<item.length; i++) {
				total = total + item[i] + " ";
			}
			
			tf.setText(total + "���� ��!");
		}
		
	}
	
	public static void main(String[] args) {
		new ComboBoxExam();
	}



}