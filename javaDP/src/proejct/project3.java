package proejct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class project3 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null; 
		PreparedStatement pstmt = null;
		String sql =" select * from dept where loc like ?"; // * <- 검색하는 곳에는 ? 를 사용할 수 없음. 값에 해당하는 것만 PreparedStatment 특성 사용 가능.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩!");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("Mysql 접속 성공!");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "판교");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%d, %s, %s\n", deptno,dname,loc);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		
	}

}
