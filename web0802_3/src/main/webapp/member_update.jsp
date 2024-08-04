<%@page import="login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
    request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");	
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	

	LoginDAO dao = new LoginDAO();
	dao.updateID(id,pw,name);
	
	session.setAttribute("userName", name);
	

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('수정이 완료되었습니다.');
    opener.location.reload(true);  // 사용자 이름이 바뀌었으면 바로 반영
    window.close();
</script>

</body>
</html>