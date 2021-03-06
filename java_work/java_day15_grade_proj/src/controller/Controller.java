package controller;

import static resource.R.*;

import view.Search;

public class Controller {
	
	public static void search() {
		viewArr[4].display(); // ******
		data.dtoArr = dao.select(data.dto); // ******
		((Search)viewArr[4]).display(data.dtoArr); // ******
	}
	
	public static void service() {
		
		try {
			viewArr[data.no].display();
			
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
				viewArr[data.no].display();
				break;
			case 4 : 
				search();
				break;
			case 5 : 
				search();
				viewArr[data.no].display();
				dao.update(data.dto);
				break;
			case 6 : 
				search();
				
				break;
			case 7 : 
				System.out.println("프로그램을 종료 합니다! BYE");
				System.exit(0);
				break;
			default :
				System.out.println("번호를 잘 못 입력 하셨습니다.");
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("해당 메뉴는 준비 되지 않았습니다.");
			return;
		} catch (Exception e) {
			System.out.println("잘 못 누르셨습니다. 번호만 입력해주세요");
			return;
		}
		
		data.no = 0;
		service();
	}
}
