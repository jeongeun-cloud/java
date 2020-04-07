package java_day07;

import java.util.Random;
import java.util.Scanner;

//����� ���
//enum�� JDK 1.5 �̻󿡼� ����Ѵ�.
//Ŭ����ȭ �� ��� �������̴�.
//���� ���� �ִ� ������� ��� �ɺ����� ��Ī�� �������� ������ ��.
//Enum Ŭ�������� ������� Ŭ������ ���� ����
//�� �������� ����� ���������� Enum Ŭ�������� ���������.


public class Ch03Ex24 {
	public static final int ���� = 1;
	public static final int ���� = 2;
	public static final int �� = 3;
	
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		// ��� ����ϱ�
		// ����-����-�� ������ switch-case�� �����
		// 1:����, 2:����, 3:��
		
		System.out.println(":::: ���� ���� �� ���� ::::");
		System.out.println("1)���� 2)���� 3)��");
		System.out.println();
		
		String[] arr = {"","����","����","��"};
		
		int sysNum = ���� + random.nextInt(��); // 1 + random.nextInt(3); // ������������ ������
		
		System.out.print("����� �Է� : ");
		int userNum = scan.nextInt();
		while(!(userNum >= ���� && userNum <=��)){
			System.out.println("��� : �߸� �Է� �ϼ̽��ϴ�!");
			System.out.print("����� �Է� : ");
			userNum = scan.nextInt();
		}
		
		System.out.println("�ý��� => " + arr[sysNum]);
		System.out.println("����� => " + arr[userNum]);
		
		if(userNum == sysNum){
			System.out.println("��� : �����ϴ�!");
		} else {
			switch(userNum) {
			case ���� : 
				switch(sysNum) {
				case ���� : System.out.println("�ý��� ��!"); break;
				case �� : System.out.println("����� ��!"); break;
				}
				break;
			case ���� : 
				switch(sysNum) {
				case �� : System.out.println("�ý��� ��!"); break;
				case ���� : System.out.println("����� ��!"); break;
				}
				break;
			case �� : 
				switch(sysNum) {
				case ���� : System.out.println("�ý��� ��"); break;
				case ���� : System.out.println("����� ��"); break;
				}
			}
		}
	}

}
