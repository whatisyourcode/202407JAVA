<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        input[type=text], textarea { width:100%; }
    </style>
</head>
<body>

<form method="post" action="productUpdate2.jsp">
	<input type="hidden" name="id" value="${product.id}">
    <table>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"  maxlength="80"
                       value="${product.name}">
            </td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description" maxlength="20"
                       value="${product.description}">
            </td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price" maxlength="20"
                       value="${product.price}">
            </td>
        </tr>
                <tr>
            <th>Stock</th>
            <td><input type="text" name="stock" maxlength="20"
                       value="${product.stock}">
            </td>
        </tr>
    </table>

    <br>
    <input type="submit" value="저장">
    <input type="button" value="취소" onclick="history.back()">
</form>

</body>
</html>