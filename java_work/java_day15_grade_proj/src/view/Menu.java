package view;

public class Menu implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(menuTitle);
		
		for(int i=1; i<menuArr.length; i++) {
			System.out.printf("%d.%s   ", i, menuArr[i]);
		}
		
		System.out.println();
		System.out.print("번호 선택 : ");
		data.no = scan.nextInt();
		
	}
	
	// 단위 테스트	
//	public static void main(String[] args) {
//		Menu menu = new Menu();
//		menu.display();
//		
//	}

}
