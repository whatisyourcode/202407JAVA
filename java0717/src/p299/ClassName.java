package p299;

public class ClassName {
		int fiel1;
		void method1() {
			field2 = 200;
			this.field2 = 300;
		}
		// static 영역에서 인스턴스 멤버를 사용할 수 없다.
		// 인스턴스 영역에서 static 멤버를 사용할 수 있다.
		
		static int field2;
		static void method2() {
			field2 =100;
		}
		
		public static void main(String[] args) {
//			method1(); // 에러
			ClassName.method2();
			System.out.println(ClassName.field2);
			ClassName c1 = new ClassName();
			c1.method1();
			System.out.println(c1.fiel1);
		}
}
