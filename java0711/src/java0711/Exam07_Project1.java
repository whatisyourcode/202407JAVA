package java0711;

import java.util.Scanner;

public class Exam07_Project1 {	
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		// 1. 로그인 변수 , 입력을 받을 로그인 변수
		String ID = "";
		String PW = "";
		String logID = "";
		String logPW = "";
		
		// 2. 회원가입 변수
		String name = "";
		String ssn = "";
		String tel = "";
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("로그인 처리");
				// 입력
				System.out.print("아이디: ");
				logID = scanner.nextLine();
				System.out.print("비밀번호: ");
				logPW = scanner.nextLine();
				// ID/PW 확인 출력
				if(ID.equals(logID)) {
						if(PW.equals(logPW)) {
							System.out.println("로그인 성공");
					}
				}else {
					System.out.println("로그인 실패");
				}
				break;
				
			case 2:
				System.out.println("회원가입");
				// 입력
				System.out.println("[필수 정보 입력]");	
				System.out.print("1. 이름: ");
				name = scanner.nextLine();
				System.out.print("2. 주민번호6자리: ");
				ssn = scanner.nextLine();
				System.out.print("3. 전화번호: ");
				tel = scanner.nextLine();
				System.out.print("4. ID: ");
				ID = scanner.nextLine();
				System.out.print("5. PW: ");
				PW = scanner.nextLine();
				// 출력
				System.out.println("[입력된 내용]");
				System.out.println("1. 아이디: " + name);
				System.out.println("2  주민번호 6자리: "+ ssn);
				System.out.println("3. 전화번호: "+ tel);
				System.out.println("4. ID: "+ ID);
				System.out.println("5. PW: "+ PW);
				break;
				
			case 3:
				System.out.println("예금/출금");
				boolean run2 =true;
				while(run2) {
					System.out.println("-----------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-----------------------------");
					System.out.print("선택>> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());	
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						System.out.println("예금/출금 종료");
						run2 = false;
						break;
					}
				}
				break;

			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}

}
