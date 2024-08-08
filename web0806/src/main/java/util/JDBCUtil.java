package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConnection() {
		//데이터베이스 접속
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(URL, "scott", "tiger");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}
	public static void close(PreparedStatement stmt, Connection conn) { // insert,update,delete
		try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) { // select
		try {
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
