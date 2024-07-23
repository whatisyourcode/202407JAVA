package lamda;

public class Ex5 {

	public static void main(String[] args) {
		MyInterf4 myinterf4 = (x,y)->x+y;
		
		int x = myinterf4.method(100, 700);
		System.out.println(x);

	}

}
