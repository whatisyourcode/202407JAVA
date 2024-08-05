<%@page import="webProject.BoardDTO"%>
<%@page import="webProject.BoardDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
String name = (String)session.getAttribute("name");
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.increaseHits(Integer.parseInt(num));
BoardDTO dto = dao.getOne(Integer.parseInt(num));
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }
        table {
            width: 100%;
            max-width: 800px;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 15px;
            border: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #009688;
            color: white;
        }
        td {
            background-color: #f9f9f9;
        }
        .btn {
            display: inline-block;
            padding: 10px 15px;
            font-size: 16px;
            color: white;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            text-align: center;
            text-decoration: none;
            margin-right: 10px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #0056b3;
        }
        .btn-danger {
            background-color: #dc3545;
        }
        .btn-danger:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td><%=dto.getTitle() %></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><%=dto.getWriter() %></td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td><%=dto.getRegtime() %></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%=dto.getHits() %></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%=dto.getContent() %></td>
    </tr>
</table>

<br>
<a href="list.jsp" class="btn">목록보기</a>
<% 
if(name != null && name.equals(dto.getWriter())) {
%>
<a href="write2.jsp?num=<%=dto.getNum()%>" class="btn">수정</a>
<a href="delete.jsp?num=<%=dto.getNum()%>" class="btn btn-danger">삭제</a>
<%
}
%>

</body>
</html>
