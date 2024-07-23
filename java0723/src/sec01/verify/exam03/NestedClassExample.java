package sec01.verify.exam03;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
// 		Car.Engine engine2 = myCar.new Engine(); // 정적 클래스는 인스턴스 클래스를 접근할 수 없다.
	}

}
