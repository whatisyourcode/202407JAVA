package templateMethod;

public abstract class AbstractDisplay {
	// open, print,close는 하위 클래스에 구현을 맡기는 추상 메서드
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	// display()는 AbstractDisplay에서 구현하는 메서드 , final은 재정의하지 못하는 타입.
	public final void display() {
		open();
		for(int i=0; i<5; i++) {
			print();
		}
		close();
	}
}
