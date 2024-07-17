package sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation; // 사용 가능한 바퀴 회전 횟수
	public int accumulatedRotation; // 사용한 바퀴 회전 횟수
	public String location; 

	// 생성자
	public Tire(String location,int maxRotation) {
		this.location = location; 
		this.maxRotation = maxRotation;
	}
	
	// 메소드 
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: "+ 
				(maxRotation-accumulatedRotation) + "회" );
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
