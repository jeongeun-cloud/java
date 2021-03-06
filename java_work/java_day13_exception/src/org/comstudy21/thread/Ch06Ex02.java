package org.comstudy21.thread;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(this.currentThread());
			System.out.println("MyThread의 run 함수");
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
		th2.start(); // run이 아니라 start로 시작해야함 (동적바인딩)
					 //(run으로 할 경우 단일 스레드가 되서 run을 전부 호출 한 후에 메인 실행함)
		
		for(int i=0; i<50; i++) {
			Thread th = Thread.currentThread();
			System.out.println(th.currentThread());
			Thread.sleep(100);
		}
	}
}
