package org.comstudy21.controller;

import static org.comstudy21.resource.R.*;

import org.comstudy21.model.Dto;
import org.comstudy21.view.Search;

public class Controller {
	
	public static void search() {
		viewArr[3].display(); // �˻��� �Է� ���
		// �ش� �˻�� ������ select �ϰ� ��� ���
		data.dtoArr = dao.select(data.dto);
		((Search)viewArr[3]).display(data.dtoArr); // ��� ���
	}
	
	public static void service() {

		try {
			viewArr[data.no].display(); // ���� 0����  // �ʵ�� �ʱ�ȭ ������ �ʾƵ� 0���� �ʱ�ȭ ��  
			
			switch(data.no) {
			case 1 : 
				viewArr[data.no].display();
				// �Է¹��� data.dto �����͸� dao�� �ѱ��.
				dao.insert(data.dto);
				break;
			case 2 : 
				// dao���� �����͸� ������ �Ŀ� ��� �̵�
				Dto[] dtoArr = dao.selectAll();
				data.dtoArr = dtoArr;
				// data.dtoArr = dao.selectAll(); // ���� 2������ �̷��� ����ص� ��
				viewArr[data.no].display();
				break;
			case 3 :
				// ���� �Լ�ȭ => ����, �������� ���� ���̱� ������
//				viewArr[data.no].display(); // �˻��� �Է� ���
//				// �ش� �˻�� ������ select �ϰ� ��� ���
//				data.dtoArr = dao.select(data.dto);
//				((Search)viewArr[data.no]).display(data.dtoArr); // ��� ���
				search();
				break;
			case 4 :
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.update(data.dto);
				}
				break;
			case 5 : 
				search();
				viewArr[data.no].display();
				if(data.dto.getIdx() != 0) {
					dao.delete(data.dto);
				}				
				break;
			case 6 : 
				System.out.println("---------- ���α׷� ���� ----------");
				System.exit(0);
				break;
			default : // ��ȿ�� üũ ��� ���
				System.out.println("�ش� ���� �����ϴ�!");
				break;
			}
						
		} catch (NullPointerException e) {
			System.out.println("���� : �޴��� �غ� ���� �ʾҽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("���� : �ش� ���� �����ϴ�.");
		}
		
		data.no = 0;
		service();
	}

}