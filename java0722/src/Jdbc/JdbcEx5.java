package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx5 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql = "select count(*) AS count from dept";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			rs.next();

			System.out.printf("총 건수 : %d\n",rs.getInt("count"));
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		
		
	}

}
