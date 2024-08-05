<%@page import="webProject.BoardDTO"%>
<%@page import="webProject.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    
<%

String name = (String)session.getAttribute("name");
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
BoardDTO dto = dao.getOne(Integer.parseInt(num));
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            width: 700px;
            max-width: 100%;
        }

        table {
            width: 100%;
            margin-bottom: 20px;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #009688;
            color: #fff;
        }

        input[type=text], textarea {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        textarea {
            resize: vertical;
        }

        input[type=submit], input[type=button] {
            background-color: #009688;
            border: none;
            color: white;
            padding: 10px 15px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 5px 2px;
            cursor: pointer;
            border-radius: 4px;
            transition: background-color 0.3s;
        }

        input[type=submit]:hover, input[type=button]:hover {
            background-color: #00796b;
        }

        input[type=button] {
            background-color: #f44336;
        }

        input[type=button]:hover {
            background-color: #c62828;
        }
    </style>
</head>
<body>
<form method="post" action="update.jsp">
    <input type="hidden" name="num" value="<%=num%>">
    <table>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title" maxlength="80"
                       value="<%=dto.getTitle() %>">
            </td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer" maxlength="20"
                       value="<%=name %>" readonly>
            </td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea name="content" rows="10"><%=dto.getContent() %></textarea>
            </td>
        </tr>
    </table>
    <br>
    <input type="submit" value="수정">
    <input type="button" value="취소" onclick="history.back()">
</form>

</body>
</html>