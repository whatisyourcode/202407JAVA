package dp;

public class Main2 {

	public static void main(String[] args) {
		Student minsu = new Student("민수");
		Course java = new Course("cs100", "자바");
		Course cplus = new Course("cs101", "C/C++");
		// 학생 코스 등록.
		minsu.registerCourse(java);
		minsu.registerCourse(cplus);
		
		Student gildong = new Student("길동");
		gildong.registerCourse(java);
		
	//	System.out.println(minsu);
	//	System.out.println(gildong);

		// 코스별 신청자 출력
		java.addStudent(gildong);
		java.addStudent(minsu);
		cplus.addStudent(gildong);
		
		System.out.println("자바 수강신청자 : " + java.getNumOfStudent()+ "명");
		for(Student student : java.getStudents()) {
			System.out.println(student.getName());
		}
		System.out.println("c언어 수강 신청자 :" + cplus.getNumOfStudent()+ "명");
		for(Student student : cplus.getStudents()) {
			System.out.println(student.getName());
		}
		
	}

}
