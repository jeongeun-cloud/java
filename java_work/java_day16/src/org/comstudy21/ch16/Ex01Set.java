package org.comstudy21.ch16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01Set {

	public static void main(String[] args) {
		// key�� ����, index�� ���� Set����
		// Value�� �ߺ��� ����.
		// <> ��ȣ�� ���׸� : ��� �� Ÿ���� ������Ų��.
		// HashSet �ڿ� <>�ȿ� Ÿ���� �����ص� ���� (�ڹ�6����)
		Set<String> set = new HashSet<>();
		set.add("��¡��");
		set.add("�öѱ�");
		set.add("�뱸");
		set.add("����");
		set.add("�ź���");
		set.add("����"); // Value�� �ߺ��� ���� ������ �ߺ��Ǵ� ���� set�� ũ�⿡ ���Ե��� ���� 
		
		System.out.println("set�� ũ�� : " + set.size());
		
		// �����ڷ� ��ȯ�Ѵ�
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) { // ��Ұ� �ִ���
//			System.out.println(iterator.next()); 
//		}
		
		// �迭�� ��ȯ
		String[] arr = new String[set.size()];
		set.toArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
}


