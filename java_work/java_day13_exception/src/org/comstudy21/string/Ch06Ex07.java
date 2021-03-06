package org.comstudy21.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


class People {
	String name;
	int age;
	String addr;
	String job;
	String phone;
	
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", addr=" + addr + ", job=" + job + ", phone=" + phone + "]";
	}

}


public class Ch06Ex07 {
	
	public static void main2(String[] args) {
		String str = "홍길동|25|서울시 종로구|프로그래머|010-1234-5678";
		StringTokenizer strtz = new StringTokenizer(str, "|");
		
		ArrayList<String> list = new ArrayList<>(); // ArrayList는 처음에 사이즈를 적지 않아도 됨
		while(strtz.hasMoreTokens()) {
			list.add(strtz.nextToken());
		}
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		
		// CSV 형식, TSV ...
		String str = "홍길동|25|서울시 종로구|프로그래머|010-1234-5678";
		StringTokenizer strtz = new StringTokenizer(str, "|");
		
		System.out.println(strtz.countTokens()); // 5개로 나눠졌다
		String[] strArr = new String[strtz.countTokens()]; // token크기만큼 배열을 만들기
		
		// 잘라서 출력해라
//		while(strtz.hasMoreTokens()) {
//			System.out.println(strtz.nextToken());
//		}
		
		// 배열에 담아서 출력해라
		int i = 0;
		while(strtz.hasMoreTokens()) {
			strArr[i++] = strtz.nextToken();
		}
		System.out.println(Arrays.toString(strArr));
		
		// 객체에 담아서 출력해라 
		People p = new People();
		p.name = strArr[0];
		p.age = Integer.parseInt(strArr[1]);
		p.addr = strArr[2];
		p.job = strArr[3];
		p.phone = strArr[4];
		
		System.out.println(p);
	}

}
