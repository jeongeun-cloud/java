package book_practice;

import java.util.Scanner;

public class Ex08 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String st = scan.nextLine();
		
		for(int i=0; i<st.length(); i++) {
			char c = st.charAt(0);
			st = st.substring(1);
			
			st = st.concat(Character.toString(c));
			System.out.println(st);
		}
		
	}
}
