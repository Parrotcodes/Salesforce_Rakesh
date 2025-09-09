<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<div class="login-container">
    <h2>Register</h2>
    <form action="register" method="post">
      <label for="uname">Username:</label>
      <input type="text" id="uname" name="username" required>
      
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>
      
     <div class="form-group">
        <label>Gender</label>
        <div class="radio-group">
          <label><input type="radio" name="gender" value="male" required> Male</label>
          <label><input type="radio" name="gender" value="female"> Female</label>
          <label><input type="radio" name="gender" value="other"> Other</label>
        </div>
      </div>
      
        <div class="form-group">
        <label for="marital">Marital Status</label>
        <select id="marital" name="marital" required>
          <option value="">-- Select --</option>
          <option value="single">Single</option>
          <option value="married">Married</option>
          <option value="divorced">Divorced</option>
          <option value="widowed">Widowed</option>
        </select>
      </div>

      <label for="pwd">Enter Password:</label>
      <input type="password" id="pwd" name="password" required>

      <input type="submit" value="Register">
    </form>
    <br/>
     <a href="login.jsp">Login</a>
  </div>
</body>
</html>