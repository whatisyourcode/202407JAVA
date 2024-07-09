package java0709;

import java.util.Scanner;

public class parsePositiveInteger {
	public static int getPositiveNumber(int number) {
		if(number > 0) {
			return number;
		}else {
			return number * -1;
		}
	}
	
	public static int getNumber(String msg,Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
		
	}
	public static void main(String[] args) {
		int number = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		number = getNumber("입력할 숫자 : ",sc);
		
		result = getPositiveNumber(number);
		System.out.printf("숫자는 : %d 입니다.",result);
	}
}
