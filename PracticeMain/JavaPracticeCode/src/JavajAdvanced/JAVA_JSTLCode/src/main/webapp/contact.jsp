<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
<link rel="icon" href="fav.png"/>

    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        h2 {
            color: #333;
        }
        form {
            margin-top: 20px;
        }
        input, textarea {
            width: 300px;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type=submit] {
            background-color: #333;
            color: white;
            cursor: pointer;
        }
        input[type=submit]:hover {
            background-color: #575757;
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
 <h2>Contact Us</h2>
    <p>If you have any questions, feel free to send us a message:</p>
    
    <form action="ContactServlet" method="post">
        <input type="text" name="name" placeholder="Your Name" required><br/>
        <input type="email" name="email" placeholder="Your Email" required><br/>
        <textarea name="message" rows="5" placeholder="Your Message" required></textarea><br/>
        <input type="submit" value="Send Message">
    </form>
</body>
</html>