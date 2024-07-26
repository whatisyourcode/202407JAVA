<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		int sum = 0;
		double avg = 0.0;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
//		out.println("드라이버 로딩!!");
		conn = DriverManager.getConnection(URL, "root", "mysql");
//		out.println("mysql 접속!!");
		String sql = "select * from score;";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();			

		%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SELECT 테이블</h1>

	<table border="1">
		<tr><td>이름</td><td>국어</td><td>영어</td><td>수학</td><td>총점</td><td>평균</td></tr>
	<% 
		while(rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int math = rs.getInt("math");
			sum = kor+ eng+ math; 
			avg = sum / 3;
	%>
			<tr><td><%=num%></td><td><%=name%></td><td><%=kor%></td><td><%=eng%></td><td><%=math%></td><td><%=sum%></td><td><%=avg%></td></tr>			
	<% 
		}
	%>
	</table>
	
</body>
</html>