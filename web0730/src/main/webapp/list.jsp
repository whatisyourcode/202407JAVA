<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");


	// 임시 저장 변수
	String numTmp = "";
	String writerTmp = "";
	String titleTmp = "";
	String regtimeTmp = "";
	String hitsTmp = "";
	String sqlTmp = "";
	

	// 매개변수들
	request.getParameter("UTF-8");
	String num = request.getParameter("num"); 
	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String regtime = request.getParameter("regtime");
	String hits = request.getParameter("hits");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table     { width:680px; text-align:center; }
        th        { background-color:cyan; }
        
        .num      { width: 80px; }
        .title    { width:230px; }
        .writer   { width:100px; }
        .regtime  { width:180px; }
                
        a:link    { text-decoration:none; color:blue; }
        a:visited { text-decoration:none; color:gray; }
        a:hover   { text-decoration:none; color:red;  }
    </style>
</head>
<body>

<table>
    <tr>
        <th class="num"    >번호    </th>
        <th class="title"  >제목    </th>
        <th class="writer" >작성자  </th>
        <th class="regtime">작성일시</th>
        <th                >조회수  </th>
    </tr>
<%
sqlTmp = "select * from board";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	numTmp = rs.getString("num");
	titleTmp = rs.getString("title");
	writerTmp = rs.getString("writer");
	regtimeTmp = rs.getString("regtime");
	hitsTmp = rs.getString("hits");
	
%>
	<tr>
	<td><%=numTmp %></a></td><td><a href="view.jsp?num=<%=numTmp%>"><%=titleTmp %></td><td><%=writerTmp %></td>
	<td><%=regtimeTmp %></td><td><%=hitsTmp %></td>
	</tr>
<%
}
%>	
</table>

<br>
<input type="button" value="글쓰기" onclick="location.href='write.jsp'">

</body>
</html>