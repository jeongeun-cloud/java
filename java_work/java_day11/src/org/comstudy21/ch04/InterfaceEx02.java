package org.comstudy21.ch04;

interface PhoneInterfaceEx {	// �������̽� ����
	final int TIMEOUT = 10000;	// ��� �ʵ� ����
	void sendCall();	// �߻�޼ҵ�
	void receiveCall();	// �߻�޼ҵ�
	default void printLogo() {	// default �޼ҵ�
		System.out.println("** Phone **");
	}
	
}

interface MobilePhoneInterface extends PhoneInterfaceEx {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {	// �������̽� ����
	public void play();
	public void stop();
}

class PDA {	// Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y;
	}
}

// SmartPhone Ŭ������ PDA�� ��ӹް�, 
// MobilePhoneInterface�� MP3Interfac �������̽��� ����� �߻� �޼ҵ带 ��� �����Ѵ�

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	
	//MobilePhoneInterface �� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("���� �Ծ��");
	}
	
	
	// MP3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� �����մϴ�");
	}
	
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�");
	}
	
	
	// �߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�");
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ�" + phone.calculate(3, 5));
		phone.schedule();
	}
}