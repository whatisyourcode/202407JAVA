package java0711;

import java.util.Scanner;

public class Quiz3 {
	public static int sumOf(int a,int b) {
		int temp = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		} 
		
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		System.out.print("b의 값 : ");
		b = sc.nextInt();
		
		System.out.println("a와 b까지 모든 정수의 합은 " + sumOf(a,b) +"입니다.");
		
	}	

}
