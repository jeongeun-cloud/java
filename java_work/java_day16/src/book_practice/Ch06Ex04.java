package book_practice;

import java.util.StringTokenizer;

// 이론문제 4번
public class Ch06Ex04 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6",",=");
		int total = 0;
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
			if(Character.isDigit(token.charAt(0))){
				total += Integer.parseInt(token);
			}
		}
		System.out.println("합은 " + total);
	}
}
