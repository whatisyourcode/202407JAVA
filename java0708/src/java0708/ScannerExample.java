package java0708;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();

			if(inputData.equals("q")) {
				System.out.println("----quit this program----");
				break;
			}
			
			System.out.print(">>");
			System.out.println("입력된 문자열: \"" + inputData + "\""); 

		}
	}

}
