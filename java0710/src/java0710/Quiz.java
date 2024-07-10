package java0710;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		int i;
		// 문제1 1 부터 10까지 출력
		for(i=1; i<=10; i++) {
			System.out.print(i+" ");
			if(i==10) {
				System.out.println();
			}
		}
		// 문제2 1부터 10까지 합 출력
		int sum2 = 0;
		for(i=1; i<=100; i++) {
			sum2 += i;
			if(i==100) {
				System.out.println("result2 : " + sum2 );
			}
		}
		
		// 문제2 while문으로 변환
		i = 1;
		sum2 = 0;
		while(i <= 100) {
			sum2 += i;
			i++;
		}
		System.out.println("result2-2 : " + sum2);
		
		
		
		// 문제3 1부터 10까지 짝수 출력
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			if(i==10) {
				System.out.println();
			}
		}
		
		// 문제3 do-while문으로 변환 
		int sum3 = 0;
		i = 1;
		do {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i <= 10);
		System.out.println();
		
		
		// 문제4 1부터 100까지 짝수의 합계
		int sum4 = 0;
		for(i=1; i<=100; i++) {
			if(i%2==0) {
				sum4 += i;
			}
			if(i==100) {
				System.out.println("result4 : " + sum4 );
			}
		}
		
		// 문제5 구구단 출력하기(전체)
		for(i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d x %d= %d\t ", j,i,j*i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------");
		// 문제6 구구단 출력하기 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단 입력 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		System.out.printf("사용자가 입력한 단 : %d단\n", dan);
		for(i=1; i<=9; i++) {
			System.out.printf(" %d x %d = %d |", dan,i,dan*i);
		}
		
	}

}
