<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>IF-else Example</h1>
	<form action="colorResult.jsp" method="post">
	이름 : <input type="text" name="name"><br>
	좋아하는 색깔 : <select name="color">
				<option value="red">빨강색</option>
				<option value="blue">파란색</option>
				<option value="yellow">노랑색</option>
				<option value="green">초록색</option>
				</select><br>
	<input type="submit" value="보내기">
	</form>
</body>
</html>