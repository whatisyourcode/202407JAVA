<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <td>${product.id}</td>
    </tr>
    <tr>
        <th>Name</th>
        <td>${product.name}</td>
    </tr>
    <tr>
        <th>Description</th>
        <td>${product.description}</td>
    </tr>
    <tr>
        <th>Price</th>
        <td>${product.price}</td>
    </tr>
    <tr>
        <th>Stock</th>
        <td>${product.stock}</td>
    </tr>
</table>
<input type="button" value="목록보기" onclick="location.href='productList.jsp'">
</body>
</html>
