package java0709;

public class Ex02 {

	public static void main(String[] args) {
		float f1 = 3.14f; // 기본적으로 실수 리터럴은 double 타입으로 잡힌다.
		double d1 = 3.14; 
	//	double d2 = 314e-2; // /100 
		double d2 = 3142; // *100

		
		System.out.println(d2);
		
		int sum;
		int score1 = 0;
		int score2; 
//		sum = score1 + score2; // score2는 초기화되지 않은 변수를 연산에 사용하려 하기 때문에 error.
		
		int x1 = 100;
		if (true) {
			int x2 = 300;
			System.out.println(x1);
		}
//		System.out.println(x2); // 실행 시 이 타이밍에 메모리에는 없는 변수이기 때문에 error

	}

}
