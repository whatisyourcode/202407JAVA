package java0711;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구하는 문제");

		do {
			System.out.print("n의 값 >>");
			n = sc.nextInt();
		}while(n <= 0);
		
		/*
		for(int i=1; i<=n; i++) {
			if(i==n) {
				System.out.println(i+"="+sum);
				break;
			}
			System.out.print(i+"+");
			sum += i;
		}*/
		
		/*
		for(int i=1; i<=n; i++) {
			if(i < n) {
				System.out.print(i + "+");
			}else {
				System.out.print(i + "=");
			}
			sum+= i;
		}
		System.out.println(sum);
		*/
		
		for (int i=1; i<n; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		
		System.out.print(n+"=");
		sum += n;
		System.out.println(sum);
		
	}

}
