package java0729;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		// 메인 스레드 
		Thread mThread = Thread.currentThread();
		System.out.println(mThread.getName());
	
		// Thread A를 별도로 생성해서 사용.
		ThreadA threadA = new ThreadA();
		threadA.start();
		// Thread B는 익명의 자식 객채 생성으로 구현 
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=0; i<2; i++) {
					System.out.println(this.getName());
					try {
					Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		threadB.setName("ThreadB");
		threadB.start();
		
		// 스레드C Runnable 구현 객체 생성으로 만들기
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<2; i++) {
					System.out.println();
				}
			}
		});
		
		
		
	}

}
