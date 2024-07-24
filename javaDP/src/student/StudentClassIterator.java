package student;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentClassIterator implements Iterator<Student> {
	private StudentClass studentClass;
	private int index;
	
	public StudentClassIterator(StudentClass studentClass) {
		this.studentClass = studentClass;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < studentClass.getLength()) {
			return true; 
		}else {
			return false;
		}
	}

	@Override
	public Student next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		Student student = studentClass.getStudentAt(index);
		index++;
		return student;
	}

}
