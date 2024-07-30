package java0730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Ex7 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql = "select * from score";
		List<Score> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,"root","mysql");
			System.out.println("접속 성공!");
			stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery(sql);
			System.out.println("쿼리 성공!");
			
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math"); 
				list.add(new Score(num,name,kor,eng,math));
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		list.stream().forEach(System.out::println);
//		list.forEach(s -> System.out.println(s.toString()));
		
		int korSum = list.stream().mapToInt(s->s.getKor()).sum();
		System.out.println("국어 총점: "+ korSum);
		
		OptionalDouble korAvg = list.stream().mapToInt(s->s.getKor()).average();
		korAvg.ifPresent(avg -> System.out.println("국어 평균: " + avg));
		
		int engSum = list.stream().mapToInt(s->s.getEng()).sum();
		System.out.println("영어 총점: "+ engSum);
		
		OptionalDouble engAvg = list.stream().mapToInt(s->s.getEng()).average();
		engAvg.ifPresent(avg -> System.out.println("영어 평균: " + avg));

		int totSum = list.stream().mapToInt(s->s.getSum()).sum();
		System.out.println("전체 총점: "+ totSum);
		
		OptionalDouble totAvg = list.stream().mapToDouble(s->s.getAvg()).average();
		totAvg.ifPresent(avg -> System.out.println("전체 평균: " + avg));

		
	}

}
