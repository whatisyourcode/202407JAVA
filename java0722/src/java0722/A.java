package java0722;

public class A {
	class B{
		int field;
//		static int field2;
		void method1() {}
//		static void method2() {}
	} 

	public static void main(String[] args) {
//		System.out.println(A.B.field2);
		A a = new A();
		A.B b = a.new B();
		b.method1();
	}

}
