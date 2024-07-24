package adaptor;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		this.showWithParam();	// 부모 클래스에게 상속 받은 메서드를 인터페이스(설계) 구현으로 완성.
		
	}

	@Override
	public void printStrong() {
		this.showWithAster(); // 부모 클래스에게 상속 받은 메서드를 인터페이스(설계) 구현으로 완성.
	}
}
