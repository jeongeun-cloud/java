package org.comstudy21.thread;

public class Ch06Ex03 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("������ ����" + i);
			try {
				if(i==20) {
					synchronized (this) {
						this.wait(1000); // �������� �۵��� �����ϰ� ��� ���·� 
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Ch06Ex03());
		t.start();
		
		for(int i=0; i<50; i++) {
			System.out.println("���� ����" + i);
			try {
				if(i==30) {
					synchronized (t) {
						t.notify();	// ��� ���� ������ �ٽ� ���� (��������)
					//	t.stop();	// �����尡 ���ߵ��� (��� �����ϴ� ���� ����)
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}


}