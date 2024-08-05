<%@page import="webProject.UserDTO"%>
<%@page import="webProject.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String name = (String)session.getAttribute("name");
	UserDAO dao = new UserDAO();
	UserDTO dto = dao.userGetOne(name);	
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Profile</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #e0e0e0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .edit-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
            width: 350px;
            box-sizing: border-box;
        }
        .edit-container h2 {
            margin: 0 0 20px;
            font-size: 24px;
            color: #333333;
            text-align: center;
        }
        .edit-container label {
            display: block;
            margin-bottom: 8px;
            color: #555555;
            font-size: 16px;
        }
        .edit-container input[type="password"],
        .edit-container input[type="text"],
        .edit-container select {
            width: 100%;
            padding: 12px;
            margin-bottom: 15px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 16px;
            transition: border-color 0.3s;
        }
        .edit-container input[type="password"]:focus,
        .edit-container input[type="text"]:focus,
        .edit-container select:focus {
            border-color: #4CAF50;
            outline: none;
        }
        .edit-container input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 12px;
            text-align: center;
            text-decoration: none;
            display: block;
            font-size: 18px;
            margin: 10px auto 0;
            cursor: pointer;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .edit-container input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="edit-container">
        <h2>Edit Profile</h2>
        <form action="editProfile.jsp" method="post">
            <!-- ID와 Name은 수정할 수 없으므로, hidden 필드로 설정합니다 -->
            <input type="hidden" id="userId" name="id" value="<%=dto.getId()%>">
            <input type="hidden" id="userName" name="userName" value="<%=dto.getName()%>">

            <label for="password">New Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="address">New Address:</label>
            <input type="text" id="address" name="address" value=<%=dto.getAddress()%> required>

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" value=<%=dto.getGender() %> required>
                <option value="M">Man</option>
                <option value="W">Woman</option>
            </select>
            
             <label for="tel">New Tel:</label>
              <input type="text" id="tel" name="tel" value=<%=dto.getTel()%> required>

            <input type="submit" value="Update Profile">
        </form>
    </div>
</body>
</html>