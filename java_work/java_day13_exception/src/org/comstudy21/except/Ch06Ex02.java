package org.comstudy21.except;

public class Ch06Ex02 {
	static String[] arr = {null, null, "Korea", null, "Hello World", null};
	public static void main(String[] args) {
		
		for(int i=0; i<arr.length; i++) {
			try {
				System.out.println(arr[i].toString());
			} catch (NullPointerException e) {
				continue;
			}
		}

	}

}
