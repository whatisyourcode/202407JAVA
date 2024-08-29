<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 데이터베이스 접속
    String URL = "jdbc:mysql://localhost:3307/spring5fs";
    Connection conn = null;
    PreparedStatement pstmt = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(URL, "root", "mysql");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Department List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        h1 {
            color: #333;
            text-align: center;
        }
    </style>
</head>
<body>
<script>
	let arr1 = [];
	let json = null;
	   <% 
       String sql = "select json_object('empno',empno,'ename',ename,'job',job,'sal',sal) as json_object from emp";
       pstmt = conn.prepareStatement(sql);
       ResultSet rs = pstmt.executeQuery();
       while(rs.next()){ 
       	String data = rs.getString(1);		
   %> 
	json = JSON.parse('<%=data%>');
	arr1.push(json)
   <% 
       }
   %>
   console.log(arr1);
   
   
   
</script>
</body>
</html>