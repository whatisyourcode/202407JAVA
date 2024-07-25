package java0725;

class MyClass{
	void method() throws Exception  {
		throw new Exception("Exception 예외!"); // 예외 발생
	}
}

public class MyExceptionEx1 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
