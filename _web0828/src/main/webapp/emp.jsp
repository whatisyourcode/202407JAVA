<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num = request.getParameter("deptno"); 
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
    <h1>부서 테이블</h1>
    <table>
        <thead>
            <tr>
            	<th class="num">사번</th>
                <th class="name">이름</th>
                <th class="job">직급</th>
                <th class="sal">월급</th>
            </tr>
        </thead>
        <tbody>
            <% 
                String sql = "select * from emp where deptno = ? ";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,num);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){ 
                    String empno = rs.getString("empno");
                    String ename = rs.getString("ename");
                    String job = rs.getString("job");
					String sal = rs.getString("sal");
                   %> 
            <tr>
                <td><%=empno %></td>
                <td><%=ename %></td>
                <td><%=job%></td>
                <td><%=sal%></td>
            </tr>
            <% 
                }
            %>
        </tbody>
    </table>
    <hr>
    <script type="text/javascript">

    </script>
    
</body>
</html>