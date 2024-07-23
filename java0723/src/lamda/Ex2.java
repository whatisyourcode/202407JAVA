package lamda;

public class Ex2 {
	public static void main(String[] args) {
		MyInterf1 myInterf1 = new MyInterf1() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("method1()");
			}
		};
		
		myInterf1.method();
		
	
		
		MyInterf1 myInterf2 = ()->{
			System.out.println("method2()");
		};
		
		myInterf2.method();
	}
}
