package book_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Ex08 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> point = new HashMap<>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			
			String userName = scan.next();
			int userP = scan.nextInt();
			
			
			if(userName.equals("�׸�")) {
				System.exit(0);
			}
			
			if(point.containsKey(userName)) {
				point.put(userName, point.get(userName)+userP);
			} else {
				point.put(userName, userP);
			}

	
			Set<String> keys = point.keySet();
			Iterator<String> it = keys.iterator();		
			
			
			while(it.hasNext()) {
				String key = it.next();
				int value = point.get(key);

				System.out.print("("+ key + ", " + value +") ");
				
			}
			System.out.println();
		
		}
	}
}