package java0711;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("n값 입력 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.println("결과값 : " + sum);
	
	}

}
