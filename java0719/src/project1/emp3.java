package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class emp3 {
	public static void main(String[] args) {
		String createString = "INSERT INTO emp VALUES"+
				"(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20)," + 
				"(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),"+
				"(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),"+
				"(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),"+
				"(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),"+
				"(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),"+
				"(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),"+
				"(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20),"+
				"(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),"+
				"(7844, 'TURNER', 'SALESMAN', 7698, '1980-09-08', 1500, 0, 30),"+
				"(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20),"+
				"(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),"+
				"(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),"+
				"(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);";
		
		// web 주소가 아니라 TCP/IP 통신으로 Mysql과 통신하기 위한 URL 
		String URL = "jdbc:mysql://127.0.0.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// con은 Mysql 접속 정보를 담는다 	 (URL,MYSQL_USER,MYSQL_PASSWORD)
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("MySQL 접속 성공!");
			stmt = con.createStatement(); // 자바 프로그램 -> DBMS으로 전달될 명령문 생성.
			int num = stmt.executeUpdate(createString); 
			System.out.println("데이터 삽입!"+ num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
