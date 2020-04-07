package controller;


import static resource.R.*;

import view.Search;


public class Controller {
	
	public static void search() {
		viewArr[3].display(); 
		data.dtoArr = dao.select(data.dto);
		((Search)viewArr[3]).display(data.dtoArr);
	}
	
	public static void service() {
		
		try {
			viewArr[data.no].display(); // ���� 0 ������ �����ֱ� ���� // ������ ���ѷ���
			
			switch(data.no) {
			case 1 : 
				viewArr[data.no].display();
				dao.insert(data.dto);
				break;
			case 2 : 
				data.dtoArr = dao.show();
				viewArr[data.no].display();
				break;
			case 3 : 
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
				System.out.println("�ý����� ���� �մϴ�!");
				System.exit(0);
				break;
			default : 
				System.out.println("��ȣ�� �� �� �Է� �Ͽ����ϴ�!");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("�ش� �޴��� �غ���� �ʾҽ��ϴ�");
			return;
		} catch (Exception e) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
			return;
		}
		
		data.no = 0;
		service();
	}

}