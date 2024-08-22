<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>사용자 관리</title>
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
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
				</form>
			</div>
		</div>
	</nav>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<div class="container" style="padding-top: 50;">
		<table class="table table-bordered table-hover">
			<tr>
				<th class="member_id">번호</th>
				<th class="name">이름</th>
				<th class="email">이메일</th>
				<th class="created_at">생성일</th>
				<th>조회수</th>
			</tr>

			<c:forEach var="mem" items="${memList}">
				<tr>
					<td>${mem.member_id}</td>
					<td style="text-align: left;"><a
						href="memberView?num=${mem.member_id}&page=${param.page}"> ${mem.name} </a></td>
					<td>${mem.email}</td>
					<td>${mem.created_at}</td>
				</tr>
			</c:forEach>
		</table>
		<button type="button" class="btn btn-outline-secondary" onclick="location.href='memberWrite'">등록</button>
		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-center">
				<c:forEach var="pgn" items="${pgnMList}">
					<li class="page-item"><a class="page-link"
						href="memberList?page=${pgn.pageNo}"> <c:choose>
								<c:when test="${pgn.curPage}">
										<u>${pgn.display}</u>
									</c:when>
								<c:otherwise>
										${pgn.display}
									</c:otherwise>
							</c:choose>
					</a></li>
				</c:forEach>
			</ul>
		</nav>
	</div>
	

</body>
</html>