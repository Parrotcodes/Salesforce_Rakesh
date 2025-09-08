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
    <form action="login" method="get">
      <label for="uname">Enter Username:</label>
      <input type="text" id="uname" name="uname" required>

      <label for="pwd">Enter Password:</label>
      <input type="password" id="pwd" name="pwd" required>

      <input type="submit" value="Login">
    </form>
    <br/>
     <a href="#">Register</a>
  </div>

</body>
</html>