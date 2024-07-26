<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int dan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=dan %>단</title>
</head>
<body>
<table border="1">
<tr><th><%=dan %>단</th></tr>
<%
	for(int i=1; i<=9; i++){
%>
		<tr><td><%=dan %>X<%=i %>=<%=dan*i%></td><tr>
<% 	
	}
%>
</table>
</body>
</html>