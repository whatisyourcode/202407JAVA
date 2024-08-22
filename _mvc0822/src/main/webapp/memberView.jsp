<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>세부 내용</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="${pageContext.request.contextPath}">스마트락</a>
        </div>
      </nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <div  class="container" style="padding-top: 50;">
    <table class="table table-bordered table-hover">
    <tr>
        <th>조회수</th>
        <td>${mem.member_id}</td>
    </tr>
    <tr>
        <th>이름</th>
        <td>${mem.name}</td>
    </tr>
    <tr>
        <th>이메일</th>
        <td>${mem.email}</td>
    </tr>
    <tr>
        <th>생성일</th>
        <td>${mem.created_at}</td>
    </tr>
</table>
<button type="button" class="btn btn-outline-primary" onclick="location.href='memberList'">목록보기</button>
<button type="button" class="btn btn-outline-success" onclick="location.href='memberDelete?num=${param.num}'">삭제</button>

</div>
</body>
</html>