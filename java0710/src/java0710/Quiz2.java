package java0710;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.print("예금액> ");
				balance += scanner.nextInt();
			}else if(select == 2) {
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
			}else if(select == 3) {
				System.out.println("잔고>"+balance);
			}else {
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	
	}

}
