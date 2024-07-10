package java0710;

import java.util.Scanner;

public class Prob4 {

	public static int maxNum(int x,int y,int z) {
		int max = x;
		
		if(y > max)
			max = y;
		if(z > max)
			max = z;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 수를 입력 : ");
		int max = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		max = maxNum(a,b,c);
		System.out.println("Max Value : " + max);
	}

}
