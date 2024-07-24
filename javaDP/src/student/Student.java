package student;

public class Student {
	private String name;
	private String hakbun;
	private double java;
	
	public Student(String name,String hakbun,int score) {
		this.name = name;
		this.hakbun = hakbun; 
		this.java = score;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", java=" + java + "]";
	}
	

}
