<%@page import="webProject.UserDTO"%>
<%@page import="webProject.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String sex = request.getParameter("sex");
	String adress = request.getParameter("address");
	UserDAO dao = new UserDAO();
	UserDTO dto = dao.userLogin(name, password);
	
	if(dto != null){
		session.setAttribute("name", name);
		response.sendRedirect("index.jsp");
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