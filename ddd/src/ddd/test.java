package ddd;

public class test {
	public static void main(String[] args) {
		B b1 = new A();
		A b2 = new A();
		
		
		
		System.out.println(b1.getX() + b1.x + b2.getX() + b2.x);
		System.out.println(b1.getX());
		System.out.println(	);
		System.out.println(b2.getX());
		System.out.println(b2.x);
	}
}

class B {
	int x = 3;
	
	int getX() {
		return x * 2; 
	}
}

class A extends B{
	int x =7;
	
	int getX() {
		return x*3;
	}
}


