<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="login.css">
<style type="text/css">
  .error {
            color: red;
            font-size: 14px;
            margin-bottom: 10px;
        }
</style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>

        <c:if test="${not empty errorMessage}">
            <div class="error">${errorMessage}</div>
        </c:if>
        
    <form action="login" method="post" >
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