package project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerInsert {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("sql문 작성: ");
		 String sql = sc.nextLine();
		 
		 String URL = "jdbc:mysql://127.0.0.1:3306/spring5fs";
		 Connection con = null;
		 Statement stmt = null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// con은 Mysql 접속 정보를 담는다 	 (URL,MYSQL_USER,MYSQL_PASSWORD)
			con = DriverManager.getConnection(URL,"spring5","spring5");
			System.out.println("MySQL 접속 성공!");
			stmt = con.createStatement(); // 자바 프로그램 -> DBMS으로 전달될 명령문 생성.
			int num = stmt.executeUpdate(sql); 
			System.out.println(num + "개의 데이터 삽입 완료");
		 
		 }catch( ClassNotFoundException | SQLException e ) {
			 e.printStackTrace();
		 }
		 
	}
}
