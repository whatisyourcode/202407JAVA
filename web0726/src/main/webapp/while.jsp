<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	request.setCharacterEncoding("UTF-8");
	String str = request.getParameter("name"); 
	int count = Integer.parseInt(request.getParameter("count"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>While Example</h1>
	<% 
		for(int i=0; i<count; i++){
	%>
		<p><%=str%></p>
	
	<% 		
		}
	%>
</body>	
</html>