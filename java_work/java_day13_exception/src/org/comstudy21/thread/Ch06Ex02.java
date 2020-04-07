package org.comstudy21.thread;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(this.currentThread());
			System.out.println("MyThread�� run �Լ�");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ch06Ex02 {
	public static void main(String[] args) throws InterruptedException {
		MyThread th2 = new MyThread();
		th2.start(); // run�� �ƴ϶� start�� �����ؾ��� (�������ε�)
					 //(run���� �� ��� ���� �����尡 �Ǽ� run�� ���� ȣ�� �� �Ŀ� ���� ������)
		
		for(int i=0; i<50; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.currentThread());
			Thread.sleep(100);
		}
	}
}