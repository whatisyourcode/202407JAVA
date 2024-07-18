package java0718interface;

public class InterEx {
	public static void main(String[] args) {
		ImplC implc = new ImplC();
		
//		변수의 타입(인터페이스 타입)에 따라서 접근할 수 있는 메서드 범위가 달라진다.
		InterA ia = implc;
		ia.methodA();
		
		InterB ib = implc;
		ib.methodB();;
	
		InterC ic = implc;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
