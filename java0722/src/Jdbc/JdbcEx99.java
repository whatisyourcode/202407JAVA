package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx99 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;

		Scanner scan = new Scanner(System.in);
		System.out.print("테이블 이름을 입력>>");
		String str = scan.nextLine();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 라이브러리 파일 로딩시킴.
			conn = DriverManager.getConnection(URL,"root","mysql"); // 해당 URL을 이용하여 데이터베이스와 연결한 객체를 반환.
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM " + str);
			ResultSetMetaData rsmd = result.getMetaData(); // 메타정보
			int numOfCol = rsmd.getColumnCount(); // 컬럼 갯수
			System.out.println(numOfCol); // 컬럼 갯수 출력.
			
			for(int i=1; i<= numOfCol; i++) {	// 컬럼의 갯수 만큼
				System.out.println(rsmd.getColumnName(i)); // 컬럼 이름을 출력.
			}
	
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
		
		
	}

}