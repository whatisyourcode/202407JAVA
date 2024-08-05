<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up Form</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .signUp-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 350px;
            box-sizing: border-box;
        }
        .signUp-container h2 {
            margin: 0 0 20px;
            font-size: 24px;
            color: #333333;
            text-align: center;
        }
        .signUp-container label {
            display: block;
            margin-bottom: 8px;
            color: #555555;
        }
        .signUp-container input[type="text"],
        .signUp-container input[type="password"],
        .signUp-container input[type="tel"],
        .signUp-container input[type="address"],
        .signUp-container select {
            width: 100%;
            padding: 12px;
            margin-bottom: 15px;
            border: 1px solid #cccccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-size: 16px;
            transition: border-color 0.3s;
        }
        .signUp-container input[type="text"]:focus,
        .signUp-container input[type="password"]:focus,
        .signUp-container input[type="tel"]:focus,
        .signUp-container input[type="address"]:focus,
        .signUp-container select:focus {
            border-color: #4CAF50;
            outline: none;
        }
        .signUp-container input[type="submit"] {
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
        .signUp-container input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="signUp-container">
        <h2>Sign Up</h2>
        <form action="signUp.jsp" method="post">
            <label for="name">Id:</label>
            <input type="text" id="name" name="name" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="tel">Phone Number:</label>
            <input type="tel" id="tel" name="tel" required>
            
            <label for="gender">Gender:</label>
            <select id="gender" name="gender">
                <option value="M">Man</option>
                <option value="W">Woman</option>
            </select>
      
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>

            <input type="submit" value="Sign Up">
        </form>
    </div>
</body>
</html>