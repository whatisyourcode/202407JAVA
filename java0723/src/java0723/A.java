package java0723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			// 모든 필드와 메소드에 접근할 수 있음.
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 10; // error
//			method1(); // error
			
			field2 = 10;
			method2();
		}
	}
	
	
	public static void main(String[] args) {
		A.C c = new A.C();
		
		System.out.println(A.field2); 
//		System.out.println(A.field1); // static method에서 인스턴스 필드를 접근할 수 없다.
		A a = new A();
		System.out.println(a.field1);
		A.B b = a.new B();
		b.method();
	}
}
