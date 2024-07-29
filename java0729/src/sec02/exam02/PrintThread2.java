package sec02.exam02;

public class PrintThread2 extends Thread {

	// try-catch 대신 if문으로 대체
	@Override
	public void run() {
			while(true) {
				System.out.println("실행 중");
				if(Thread.interrupted()) {
					break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

	
	
//	try-catch문으로 빠져나오기
//	@Override
//	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			}
//		}catch(InterruptedException e) {
//			
//		}
//		System.out.println("자원 정리");
//		System.out.println("실행 종료");
//	}

	
}
