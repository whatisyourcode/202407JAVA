package java0731_1;

public class Student extends Person {

	public int studnetNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studnetNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
	

}
