package java0711;

import java.util.Scanner;

public class Quiz1 {
	
	public static int getMiddleValue(int a,int b,int c) {
		int result = 0;
		if((b >=a && a >= c) || (b <= a && c >= a)) {
			return result = a;
		}else if((a > b && c < b) || (a < b && c > b)) {
			return result = b;
		}else {
			return result = c;
		}
		
		/*
		if(a >= b) {   
			if(b >= c) {
				result = b;
			} else if(a <= c) {
				result = a;
			} else { // c가 a보다 작고 b보다 큰 경우
				result = c;
			}
		} else if (a > c) { // a는 b보다 작다
			result = a;
		} else if (b > c) { // a가 제일 작은 경우 b와 c를 비교
			result = c;
		} else { 
			result = b;
		}
		
		return result;
		*/
	}

	public static void main(String[] args) {
		int a,b,c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 값 입력 : "); 
		a= sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("3개 수 중 중앙값 : " + getMiddleValue(a,b,c));
		
	}

}
