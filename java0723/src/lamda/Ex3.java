package lamda;

public class Ex3 {
	public static void main(String[] args) {
		MyInterf2 myInterf2 = (x)->{
			System.out.println(x);
		};
		
		myInterf2.method(200);
	}
}
