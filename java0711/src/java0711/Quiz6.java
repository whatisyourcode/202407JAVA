package java0711;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		int n = 0;
		int w = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력");
		
		do {
			System.out.print("n값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		do {

			System.out.print("w값 : ");
			w = sc.nextInt();
		}while(w <= 0 || w > n);
		
		/*
		for(int i=0; i<n; i++) {
			if(w==c) {
				System.out.println();
				c = 0;
			}
			System.out.print("*");
			c++;
		}*/
		
		for(int i=0; i<n; i++) {
			System.out.print("*");
			if(i % w == w-1) {
				System.out.println();
			}
		}
		
	}

}
