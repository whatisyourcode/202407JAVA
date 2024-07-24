package templateMethod;

public class Main {

	public static void main(String[] args) {
		// 'H'를 가진 CharDisplay 인스턴스 생성 
		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		
		AbstractDisplay d2 = new StringDisplay("Hello!");
		d2.display();
	}

}
