package java0716;

public class Calculator {
	
	
	public int plus(int x,int y) {
		return x + y;
	}
	
	public double avg(int x,int y) {
		return this.plus(x,y)/2.0;
	}
	
	public void execute() {
		double result = avg(7,10);
		this.println("실행 결과: " + this.avg(7, 10));
	}
	
	public void println(String msg) {
		System.out.println(msg);
	}

}
