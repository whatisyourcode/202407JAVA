package java0711;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("+-를 번갈아서 출력하는 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		// Version1 
		/*
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
		*/
		
		// Version2
		for(int i=0; i<n/2; i++) {
			System.out.print("+-");
		}
		if (n % 2 != 0) { // 홀수이면
			System.out.print("+");
		}
		
		
		
	}

}
