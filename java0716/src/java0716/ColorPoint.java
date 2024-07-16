package java0716;

public class ColorPoint extends Point {

	public ColorPoint() {
		super(100, 200); // 부모 클래스 생성자 호출
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x); // 부모 클래스의 x를 출력
		method1();
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	@Override
	public void method1() {
		super.method1();
		System.out.println("자식이 오버라이딩!");
	}
	

}
