<%@page import="login.LoginDTO"%>
<%@page import="login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	LoginDAO dao = new LoginDAO();
	LoginDTO dto = dao.getID(id, pw);
	if(dto != null){
		session.setAttribute("userId", dto.getId());
		session.setAttribute("userName",dto.getName());
		response.sendRedirect("login_main.jsp");
		return;
	}
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('아이디 또는 비밀번호가 틀립니다!');
    history.back();
</script>
 
</body>
</html>
