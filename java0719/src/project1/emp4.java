package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class emp4 {
	public static void main(String[] args) {
		String createString = "select * from emp;";
		
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
			ResultSet rs = stmt.executeQuery(createString);
			while(rs.next()) {
				System.out.print(rs.getString(1)+ ", ");
				System.out.print(rs.getString(2)+ ", ");
				System.out.print(rs.getString(3)+ ", ");
				System.out.print(rs.getString(4)+ ", ");
				System.out.print(rs.getString(5)+ ", ");
				System.out.print(rs.getString(6)+ ", ");
				System.out.print(rs.getString(7)+ ", ");
				System.out.println(rs.getString(8));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
