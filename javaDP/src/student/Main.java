package student;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		StudentClass studentClass = new StudentClass(4);
		studentClass.appendStudent(new Student("박창현","2470038",95));
		studentClass.appendStudent(new Student("윤상익","2470021",85));
		studentClass.appendStudent(new Student("이혁진","2470011",85));
		studentClass.appendStudent(new Student("김희준","2470015",90));

		Iterator<Student> it = studentClass.iterator();
		
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println(student.toString());
		}
		System.out.println();
	
		System.out.println("---------------------------------------");
		for(Student student : studentClass) {
			System.out.println(student.toString());
		}
	}
	
	

}
