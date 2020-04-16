package org.comstudy21.evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ListView;

import org.comstudy21.resource.R;
import org.comstudy21.view.ButtonView;
import org.comstudy21.view.MainFrame;

public class BtnEventHandler implements ActionListener, R {
	ButtonView target;

	public BtnEventHandler(ButtonView target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn == target.allBtn) {
				//System.out.println("��ü����...");
				listController.service();
			}
			if(btn == target.inputBtn) {
				//System.out.println("�߰�...");
				inputController.service();
				listController.service();
			}
			if(btn == target.deleteBtn) {
				//System.out.println("����...");
				deleteController.service();
				listController.service();
			}
			if(btn == target.searchBtn) {
				//System.out.println("�˻�...");
				searchController.service();
				//listController.service();
			}
			if(btn == target.cancleBtn) {
				//System.out.println("���...");				
				nameField.setText(null);
				emailField.setText(null);
				phoneField.setText(null);
			}
		}
		
	}

}