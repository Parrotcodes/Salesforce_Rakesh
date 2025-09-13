<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Us</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        h2 {
            color: #333;
        }
        p {
            font-size: 16px;
            line-height: 1.6;
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
<br/><br/><br/><br/>
 <h2>About Us</h2>
    <p>
        Welcome to our website! We are a small team passionate about
        building simple and effective applications for learning and
        practice.  
    </p>
    <p>
        Our goal is to help students and developers understand core
        concepts in programming, databases, and web development through
        hands-on examples.
    </p>
</body>
</html>