package java0709;

import java.util.Scanner;


public class Apple {
	
	public static int getCount(String msg, Scanner scanner) {
		System.out.print(msg);
		String input = scanner.nextLine();
		return Integer.parseInt(input);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apples = 0; 
		int persons = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		apples = getCount("사과의 개수 입력: ",scanner);
		
		persons = getCount("친구 인원 입력: ",scanner);

		result = apples % (persons+1);
		System.out.printf("남은 사과의 갯수 : %d\n", result);
	}

}
