package evt_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import resource.R;
import view.ButtonView;

public class ButtonEventHandler implements ActionListener, R {
	ButtonView target;
	
	public ButtonEventHandler(ButtonView buttonView) {
		this.target = buttonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == target.allBtn) {
				//System.out.println("��ü���� ���");
				listController.service();
			}
			if(btn == target.insertBtn) {
				//System.out.println("�߰� ���");
				insertController.service();
				listController.service();
				
			}
			if(btn == target.searchBtn) {
				//System.out.println("�˻� ���");
				searchController.service();
				
			}
			if(btn == target.updateBtn) {
				//System.out.println("���� ���");
				updateController.service();
				listController.service();
				
			}
			if(btn == target.deleteBtn) {
				//System.out.println("���� ���");
				deleteController.service();
				listController.service();
				
			}
			if(btn == target.cancleBtn) {
				System.out.println("��� ���");
				
			}
			
		}

	}

}