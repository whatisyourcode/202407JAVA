package java0719;

public class Ex1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 해당 클래스가 존재하는지 확인.
			System.out.println("Mysql 드라이버 로딩!");
		} catch (ClassNotFoundException e) {
				e.printStackTrace();	
	//			System.out.println(e.getMessage()); 
		}
	}
}
