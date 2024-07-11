package book;

public class Quiz3 {

	public static void main(String[] args) {
		int num1,num2 = 0;
		int sum = 0;
		while(true) {
			num1 = (int)(Math.random() * 4)+1;
			num2 = (int)(Math.random() * 4)+1;
			
			System.out.println("("+ num1+ "," +num2 + ")");
			sum = num1 + num2;
			if(sum == 5) {
				break;
			}
		}

	}

}
