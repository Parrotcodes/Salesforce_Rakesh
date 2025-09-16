<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contact Us - MyBlog</title>
  <style>
    body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: #f9f9f9; }
    header, footer { background: #222; color: #fff; text-align: center; padding: 1rem; }
    nav ul { list-style: none; display: flex; justify-content: center; gap: 1rem; padding: 0; }
    nav a { color: #fff; text-decoration: none; }
    nav a:hover { color: #ff9800; }

    .contact-container {
      max-width: 700px;
      margin: 2rem auto;
      background: #fff;
      padding: 2rem;
      border-radius: 10px;
      box-shadow: 0 4px 6px rgba(0,0,0,0.1);
    }
    h2 { text-align: center; margin-bottom: 1rem; }
    .form-group { margin-bottom: 1rem; }
    label { display: block; margin-bottom: .5rem; font-weight: bold; }
    input, textarea {
      width: 100%; padding: .7rem;
      border: 1px solid #ccc; border-radius: 5px;
    }
    button {
      width: 100%; padding: .8rem;
      background: #ff9800; border: none; color: #fff;
      font-size: 1rem; border-radius: 5px; cursor: pointer;
    }
    button:hover { background: #e68900; }
    .info { margin-top: 2rem; text-align: center; }
  </style>
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
        <li><a href="register.jsp">Register</a></li>
      <% } %>
        <li><a href="about.jsp">Aboutus</a></li>
        <li><a href="contact.jsp">Contact</a></li>
      </ul>
    </nav>
  </header>

  <div class="contact-container">
    <h2>Contact Us</h2>
    <form>
      <div class="form-group">
        <label>Name</label>
        <input type="text" placeholder="Enter your name" required>
      </div>
      <div class="form-group">
        <label>Email</label>
        <input type="email" placeholder="Enter your email" required>
      </div>
      <div class="form-group">
        <label>Message</label>
        <textarea rows="5" placeholder="Write your message here" required></textarea>
      </div>
      <button type="submit">Send Message</button>
    </form>

    <div class="info">
      <p><strong>Email:</strong> support@myblog.com</p>
      <p><strong>Phone:</strong> +91 98765 43210</p>
      <p><strong>Address:</strong> New Delhi, India</p>
    </div>
  </div>

  <footer>
    <p>© 2025 MyBlog | All Rights Reserved</p>
  </footer>
</body>
</html>
html>