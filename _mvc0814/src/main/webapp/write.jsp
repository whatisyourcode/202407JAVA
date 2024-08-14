<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<div class="container my-4">
    <form method="post" action="${action}">
        <div class="mb-3">
            <label for="title" class="form-label">제목</label>
            <input type="text" name="title" id="title" maxlength="80" class="form-control" value="${msg.title}">
        </div>

        <div class="mb-3">
            <label for="writer" class="form-label">작성자</label>
            <input type="text" name="writer" id="writer" maxlength="20" class="form-control" value="${msg.writer}">
        </div>

        <div class="mb-3">
            <label for="content" class="form-label">내용</label>
            <textarea name="content" id="content" rows="10" class="form-control">${msg.content}</textarea>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>

        <br><br>
        <button type="submit" class="btn btn-secondary">저장</button>
        <button type="button" class="btn btn-secondary" onclick="history.back()">취소</button>
    </form>
</div>

</body>
</html>