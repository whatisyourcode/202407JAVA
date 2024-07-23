package thread;

import java.awt.Toolkit;

public class BeepEx1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 1000 -> 1초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("땅");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
