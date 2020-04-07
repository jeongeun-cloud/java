package org.comstudy21.except;

class MyException extends Exception {
	public MyException() {
		super("myException ���� �߻�!!!");
	}
}


public class Ch06Ex04 {

	public static void test() throws Exception {
		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
