<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <h1>Login Page</h1>
    <form action="/LoginPage" method="post">
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required><br><br>
    
    <label for="Email">Email:</label>
    <input type="email" id="Email" name="Email" required><br><br>
    
    <label for="Password">Password:</label>
    <input type="password" id="Password" name="Password" required><br><br>
    
    <input type="submit" value="Login">
</form>

</body>
</html>
