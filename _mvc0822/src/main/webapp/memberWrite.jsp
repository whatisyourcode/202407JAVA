<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>스마트락</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="${pageContext.request.contextPath}">스마트락</a>
		</div>
	</nav>
	<div class="container" style="padding-top: 50;">
		<form method="post" action="adminSignUp">
			<div class="mb-3">
				<label for="name" class="form-label">이름</label> <input type="text"
					class="form-control" id="name" name="name">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">이메일</label>
				<input type="password" class="form-control"
					id="email" name="email">
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">비밀번호</label>
				<input tpye="text" class="form-control" id="password" name="password">
			</div>
			
			<br> <input type="submit" value="저장" class="btn btn-outline-primary"> <input
				type="button" value="취소" onclick="history.back()" class="btn btn-outline-danger">
		</form>
	</div>
</body>
</html>