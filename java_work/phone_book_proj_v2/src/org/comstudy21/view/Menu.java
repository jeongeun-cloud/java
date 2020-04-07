package org.comstudy21.view;

public class Menu implements View {
	
	@Override
	public void display() {
		System.out.println(menuTitle);
		for(int i=1; i<menuArr.length; i++) {
			System.out.printf("%d.%s " , i, menuArr[i]);
		}
		System.out.println();
		System.out.print("Choice : ");
		int no = scan.nextInt();
		
		data.no = no;
		
	}
	
	// 단위 테스트
//	public static void main(String[] args) {
//		new Menu().display();
//	}
}
