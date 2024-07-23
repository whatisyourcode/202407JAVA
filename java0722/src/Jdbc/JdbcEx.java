package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs"; // jdbc를 통해 MySQL 데이터베이스에 연결한다.
		Connection conn = null; // Connection 객체는 데이터베이스 연결 객체
		Statement stmt = null; // Statement 객체는 SQL을 실행하여 데이터베이스 작업을 수행하고 결과를 받아옴.
		String sql = "create table dept ("
				+ "deptno int primary key,"
				+ "dname varchar(24),"
				+ "loc varchar(13))";
	
	try {	//  MySQL JDBC Driver(Jar파일) 라이브러리에 포함되어 있는 com.mysql.cj.jdbc.Driver 클래스.
		Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버 클래스를 로드하여 데이터베이스 연결을 가능하게 한다.
		conn = DriverManager.getConnection(URL, "root", "mysql"); // URL의 해당 데이터베이스를 연결, 데이터베이스 사용자, 비밀번호
		System.out.println("접속 성공!");
		stmt = conn.createStatement(); // SQL 쿼리를 실행하기 위해 Statement 객체를 생성 
		stmt.executeUpdate(sql); // SQL 쿼리를 실행하여 dept 테이블을 생성
		System.out.println("쿼리 성공!");
		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		
	}
}
