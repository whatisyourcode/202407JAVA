package java0718;

public class Ex1 {

	public static void main(String[] args) {
//		Phone phone = new phone(); // 추상 클래스는 직접 객체 생성을 할 수 없다.
		Phone phone = new SmartPhone(); // 다형성. 추상 클래스를 상속 받은 클래스로 객체 생성 가능.	
	}

}
