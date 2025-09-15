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
<header>
    <h1>MyBlog</h1>
    <nav>
      <ul>
       <li><a href="index.jsp">Home</a></li>
         <% if (session.getAttribute("email") != null) { %>
        <li><a href="videos.jsp" target="_blank">Tutorials</a></li>
        <li><a href="logout">Logout</a></li>
      <% } else { %>
        <li><a href="login.jsp">Login</a></li>
      <% } %>
        <li><a href="about.jsp">Aboutus</a></li>
        <li><a href="contact.jsp">Contact</a></li>
      </ul>
    </nav>
</header>

<div class="container">
    <h1>Login</h1>
    <form onsubmit="onUserSubmit(event)" method="post">
        <input type="email" id="username" name="username" placeholder="Enter Username" required />
        <input type="password" id="password" name="password" placeholder="Enter Password" required />

        <label>
            <input type="checkbox" onclick="showPassword()"> Show Password
        </label><br><br>

        <button type="submit">Login</button>
    </form>

    <div id="message"></div>
</div>

<!-- Login js file -->
<script type="text/javascript" src="login.js"></script>
</body>
</html>
