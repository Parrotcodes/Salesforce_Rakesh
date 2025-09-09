<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form action="login" method="post">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>

      <label for="pwd">Password:</label>
      <input type="password" id="pwd" name="pwd" required>

      <input type="submit" value="Login">
    </form>
    <br/>
     <a href="register.jsp">Register</a>
  </div>

</body>
</html>