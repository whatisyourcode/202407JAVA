package dp;

import java.util.Vector;

public class Course {
	private String id; 
	private String name;
    private int numOfStudent;
	private Vector<Student> students;

	public Course(String id, String name) {
//		super();
		this.id = id;
		this.name = name;
		this.students = new Vector<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
		++numOfStudent;
	}
	
	public void deleteStudent(Student student) {
		if(students.contains(student)) {
			students.remove(student);
			--numOfStudent;
		}
		
	}

	public int getNumOfStudent() {
		return numOfStudent;
	}

	public Vector<Student> getStudents() {
		return students;
	}
	
}
