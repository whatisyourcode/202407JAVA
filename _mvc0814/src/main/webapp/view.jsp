<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

    <div class="container mt-4">
        <!-- Table -->
        <table class="table table-bordered">
            <tr>
                <th>제목</th>
                <td>${msg.title}</td>
            </tr>
            <tr>
                <th>작성자</th>
                <td>${msg.writer}</td>
            </tr>
            <tr>
                <th>작성일시</th>
                <td>${msg.regtime}</td>
            </tr>
            <tr>
                <th>조회수</th>
                <td>${msg.hits}</td>
            </tr>
            <tr>
                <th>내용</th>
                <td>${msg.content}</td>
            </tr>
        </table>

        <!-- Buttons -->
        <div class="mb-3">
            <a href="list" class="btn btn-secondary">목록보기</a>
            <a href="write?num=${param.num}" class="btn btn-warning">수정</a>
            <a href="delete?num=${param.num}" class="btn btn-danger">삭제</a>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>