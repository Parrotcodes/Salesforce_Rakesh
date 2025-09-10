<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
 h1{
 	text-aligin:center; 
 }
</style>

<!-- Main body -->
<body>
	<div class="container">
	<h1>Login</h1>
		<form   onsubmit="onUserSubmit(event)">
			Enter Username: <input type="text" id="username" name="username" /><br/><br/>
			Enter Password: <input type="password" id="password" name="password" /><br/>
			<input type="checkbox" onclick="showPassword()"> Show Password<br><br>
		
			<button type="submit">Login</button><br/>
		</form>
		<br/>
		    <div id="message"></div>
		
	</div>
</body>
<!-- Login js file -->
<script type="text/javascript" src="login.js"></script>
</html>