<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int result = 0;
	for(int i=1; i<=10; i++){
%>
	<h2><%=result %></h2>
<% 	result += i;
	}
%>

1부터 10까지의 합은 <%=result %> 입니다.
</body>
</html>