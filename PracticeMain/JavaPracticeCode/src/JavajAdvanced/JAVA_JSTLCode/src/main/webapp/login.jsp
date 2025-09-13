<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CR Tutorials | Login</title>
<link rel="icon" href="fav.png"/>

<style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        /* Navbar styling */
        .navbar {
            width: 100%;
            background-color: rgba(73, 196, 245,100);
            overflow: hidden;
            position: fixed;
            top: 0;
            left: 0;
        }
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }
        .navbar a:hover {
			background-color: rgba(13, 196, 245,50); 
       }

        .login-container {
            background: #fff;
            padding: 40px 30px;
            border-radius: 12px;
            box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.1);
            width: 320px;
            text-align: center;
        }
        .login-container h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 90%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            outline: none;
            transition: 0.3s;
        }
        .login-container input[type="text"]:focus,
        .login-container input[type="password"]:focus {
            border-color: #74ebd5;
            box-shadow: 0 0 5px rgba(116, 235, 213, 0.6);
        }
        .login-container input[type="submit"] {
            background: #74ebd5;
            border: none;
            color: #333;
            padding: 12px;
            width: 100%;
            border-radius: 8px;
            font-size: 16px;
            cursor: pointer;
            transition: 0.3s;
        }
        .login-container input[type="submit"]:hover {
            background: #57c6c0;
            color: white;
        }
        .login-container p {
            margin-top: 15px;
            font-size: 14px;
        }
        .login-container a {
            color: #74ebd5;
            text-decoration: none;
        }
        .login-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
   <div class="navbar">
        <a href="index.jsp">Home</a>
        <a href="about.jsp">About</a>
        <a href="contact.jsp">Contact</a>
        <a href="videos.jsp" target="_blank">Tutorials</a>
        <a href="login.jsp" >Login</a>
    </div>

	<div class="login-container">
	        <h2>Login</h2>
	        <form action="login" method="post">
	            <input type="text" name="id" placeholder="User Id" required><br/>
	             <input type="text" name="name" placeholder="Enter Username" required><br/>
	            <input type="password" name="pwd" placeholder="Enter Password" required><br/>
	            <input type="submit" value="Login">
	        </form>
	        <p>Don't have an account? <a href="#">Register</a></p>
	</div>
</body>
</html>