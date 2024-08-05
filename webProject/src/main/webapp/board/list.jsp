<%@page import="webProject.BoardDTO"%>
<%@page import="webProject.BoardDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = (String)session.getAttribute("name");

if(name == null){
    %>
   <script>
    alert('로그인 후 이용해주세요!');
    history.back();
    </script> 
<% 
}
%>

<% 
BoardDAO dao = new BoardDAO();
List<BoardDTO> list = dao.getBoardList();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        table {
            width: 100%;
            max-width: 800px;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        th, td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: center;
        }
        th {
            background-color: #009688;
            color: white;
            font-weight: bold;
        }
        td a {
            text-decoration: none;
            color: #007BFF;
        }
        td a:hover {
            text-decoration: underline;
        }
        .btn-write {
            display: block;
            width: 150px;
            margin: 20px auto;
            padding: 10px;
            font-size: 16px;
            color: #fff;
            background-color: #28a745;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
        }
        .btn-write:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <th class="num">번호</th>
        <th class="title">제목</th>
        <th class="writer">작성자</th>
        <th class="regtime">작성일시</th>
        <th>조회수</th>
    </tr>
<%
for (BoardDTO dto : list) {
%>
    <tr>
        <td><%=dto.getNum() %></td>
        <td style="text-align:left;">
            <a href="view.jsp?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a>
        </td>
        <td><%=dto.getWriter()%></td>
        <td><%=dto.getRegtime() %></td>
        <td><%=dto.getHits() %></td>
    </tr>
<%
}
%>
</table>

<a href="write.jsp" class="btn-write">글쓰기</a>

</body>
</html>
