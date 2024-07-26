<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String num3 = "";
	String name3 = "";
	String kor3 = "";
	String eng3 = "";
	String math3 = "";

	request.setCharacterEncoding("UTF-8");
	String find = request.getParameter("find");
// 	out.println(find);
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");
	String sql = "";
	String URL = "jdbc:mysql://localhost:3307/spring5fs";
	Connection conn = null;
	PreparedStatement pstmt = null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection(URL,"root","mysql");
	
	if (num!= null){
		sql = "insert into score(num,name,kor,eng,math) values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,num);
		pstmt.setString(2,name);
		pstmt.setString(3,kor);
		pstmt.setString(4,eng);
		pstmt.setString(5,math);
		pstmt.executeUpdate();	
	}
	
	// a 태그로 form 태그에 정보 활성화하기
	if (find != null){
		sql = "select * from score where num = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,find);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			num3 = rs.getString("num");
			name3 = rs.getString("name");
			kor3 = rs.getString("kor");
			eng3 = rs.getString("eng");
			math3 = rs.getString("math");
		}
	}
	


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert 프로그램</h1>
	<form>
	학번: <input type="text" name="num" value="<%=num3%>"><br>
	이름: <input type="text" name="name" value="<%=name3%>"><br>
	국어: <input type="text" name="kor" value="<%=kor3%>"><br>
	영어: <input type="text" name="eng" value="<%=eng3%>"><br>
	수학: <input type="text" name="math" value="<%=math3%>"><br>
	<input type="submit" value="제출"> <button type="button" onclick="location.href='?update=OK'">수정</button>
	</form>
	
<table border="1">
		<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    	</tr>
<% 
	sql = "select * from score";
	pstmt = conn.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();

	int sum = 0;
	double avg = 0.0;

	while(rs.next()){
		int num1 = rs.getInt("num");
		String name1 = rs.getString("name");
		int kor1 = rs.getInt("kor");
		int eng1 = rs.getInt("eng");
		int math1 = rs.getInt("math");		
		sum = kor1+ eng1+ math1; 
		avg = sum / 3;
%>
<tr>
<td><a href="ManageScore.jsp?find=<%=num1%>"><%=num1 %></a></td><td><%=name1 %></td><td><%=kor1 %></td><td><%=eng1 %></td><td><%=math1 %></td>
<td><%=sum %></td><td><%=avg %></td>
</tr>
<%	
}
%>
</table>
</body>
</html>