package company;

public class Ex1 {

	public static void main(String[] args) {
		Driver driver2 = new Driver();
		Role role = driver2;
		
		role = new Worker(); // 자동 형변환 
		if(role instanceof Worker) {
			Worker worker = (Worker) role; //  강제 형변환
		}
		
		
		// ===================================
		Person person = new Person();
		
		Driver driver = new Driver();
		Worker worker = new Worker();
		
		person.setRole(driver);
		person.doIt();
		person.setRole(worker);
		person.doIt();
		
	}

}
