package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx3 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql = "INSERT INTO dept(deptno, dname, loc) VALUES('2','총무부','인천'),"
				+ "('3','인사부','일산'), ('4','개발부','판교') ";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("쿼리 성공!");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
