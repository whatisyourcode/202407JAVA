package java0710;

public class Ex1 {
	public static void main(String[] args) {
			byte b1 = -65;
			char c1 = (char)b1;
			System.out.println(c1); // 데이터가 깨짐
			
			int x = 200;
			byte y = (byte)x;
			System.out.println(y); // byte 데이터형 허용 범위를 넘어감
			
			double d1 = 3.14;
			int z = (int)d1;
			System.out.println(z); // 소숫점 데이터가 날라감
			
			byte a1 = 10;
			byte b2 = 20;
//			byte result = a1 + b2; // byte 변수 a1,b2이 피연산자로 사용되면 int 타입으로 변환되어 연산됨.(error) 
			int result = a1 + b2; // 또다른 방법으로는 byte형으로 강제 캐스팅해주면 된다.
	
//			float result2 = 1.5 + 2.3; // 실수 리터럴은 기본적으로 double 타입으로 해석된다.(error)			
			double result2 = 1.5 + 2.3;
			
			int x1 = 1;
			int y1 = 2;
			double result3 = x / y; // 0.5가 아니라 0.0가 대입. x/y 정수형 연산이 끝난 뒤 double 타입으로 변환되어 대입된다.
			double result4 =(double) x / y;  // 0.5가 대입. 피연산자 중 하나라도 double 타입이라면 double 타입으로 변환되어 계산된다.
			System.out.println("result3 :" + result3 + " result4 :" + result4);
			
			String s1 = "가나다" + 3; // 가나다3.문자열 + 숫자(문자열로 변환)
			System.out.println(s1);
			
			int s2 = 3 + Integer.parseInt("100");
			System.out.println(s2); // 103
			
			double s3= 3 + Double.parseDouble("100.555");
			System.out.println(s3); // 103.555
			
			String str1 = String.valueOf(10); // 기본타입을 문자열로 변환. 
			String str2 = 10+"";
			System.out.println(str1);
			System.out.println(str2);
	}

}
