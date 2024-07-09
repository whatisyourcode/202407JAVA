package java0709;

import java.util.Scanner;

public class MaxValue {

	public static int getNumber(String msg,Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();		
		return Integer.parseInt(input);			

	}
	
	public static int getMaxValue(int n1,int n2,int n3) {
		int maxValue = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
		return maxValue;
	}
	
	public static int getMinValue(int n1,int n2,int n3) {

		int minValue = (n1 < n2 && n1 < n2) ? n1 : (n2 < n3) ? n2 : n3;
		return minValue;
		
	}
	
	public static void main(String[] args) {
		int n1,n2,n3;
		int maxValue = 0;
		int minValue = 0;
		Scanner sc = new Scanner(System.in);		

		n1 = getNumber("첫번째 숫자: ",sc);
		n2 = getNumber("두번째 숫자: ",sc);
		n3 = getNumber("세번째 숫자: ",sc);
		
		maxValue = getMaxValue(n1,n2,n3);
		minValue = getMinValue(n1,n2,n3);
		
		System.out.printf("최대값 : %d\n", maxValue);
		System.out.printf("최소값 : %d\n", minValue);
		
	}

}
