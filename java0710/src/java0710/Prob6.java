package java0710;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in = -10;
		if (in < 0) {
//			in = in * -1;
//			in *= -1;
			in = -in;
		}
		System.out.println(in);
	
		int x = 0;
		int y = x++;
		boolean result = x == y;
		System.out.println(y);
		System.out.println(x);
		System.out.println(result);
		
		String str1 = new String("가나다");
		String str2 = new String("가나다");
		boolean result2 = str1.equals(str2);
		System.out.println(result2);
		System.out.println(str1==str2);
		
		int c1 = 'A';
		
		// & &&  : && 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않는다. &는 둘다 평가. 
		// | ||  
		
		int input = 70;
		String score = (input >= 90) ? "A" : (input >= 80) ? "B" : (input >= 70) ? "C" : (input >= 60) ? "D" : "C";
		System.out.println("Score : " + score);
		
	}

}
