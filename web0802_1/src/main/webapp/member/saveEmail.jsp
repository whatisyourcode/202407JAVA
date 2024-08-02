<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String email = "";
	Boolean rememberMe = false;
	Cookies cookie = new Cookies(request);
	if(cookie.exists("email")){
		email = cookie.getValue("email");
		rememberMe = true;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일을 쿠키에 저장하려는 폼</title>
</head>
<body>
<form action="checkEmailResult.jsp" method="post">
	<label for="email">Email:</label>
	<input type="email" id="email" name="email" value="<%=email %>" required>
	<br>
	<input type="checkbox" id="rememberMe" name="rememberMe" <%= rememberMe ? "checked" : "" %>>
	<label for="rememberMe">Remember Me</label>
	<br>
	<input type="submit" value="Submit">
</form>
</body>
</html>