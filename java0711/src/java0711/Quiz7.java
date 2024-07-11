package java0711;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 양수를 입력받는 프로그램");
		do {
			System.out.print("no값 : ");
			no = sc.nextInt();
		}while(no < 10 || no > 99);
		
		System.out.println("변수 no값은 +"+ no +"이(가) 되었습니다.");
	}

}
