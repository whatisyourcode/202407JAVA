package thread3;

import java.time.LocalTime;

public class Ex1 {
	public static void main(String[] args) {
		Th1 th = new Th1();
		th.start();

		for (int i=0; i<10; i++) {
			System.out.println("띵");
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
