package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {

	public static void main(String[] args) {
		Student[] students = {
				new Student("홍길동",97),
				new Student("김길동",45),
				new Student("어길동",76),
				new Student("자길동",23),
				new Student("스길동",92)
		};
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		}; 
		
		Arrays.sort(students, c);
		for(Student str : students) {
			System.out.println(str);
		}
	}

}
