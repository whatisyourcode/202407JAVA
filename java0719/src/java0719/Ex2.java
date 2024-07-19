package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex2 {
	public static void main(String[] args) {
		// web 주소가 아니라 TCP/IP 통신으로 Mysql과 통신하기 위한 URL 
		String URL = "jdbc:mysql://127.0.0.1:3306/spring5fs";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// con은 Mysql 접속 정보를 담는다 	 (URL,MYSQL_USER,MYSQL_PASSWORD)
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("접속 성공!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
