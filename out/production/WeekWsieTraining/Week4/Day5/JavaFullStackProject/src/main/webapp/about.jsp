<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>About Us - MyBlog</title>
  <style>
    body { font-family: Arial, sans-serif; margin: 0; padding: 0; background: #f9f9f9; }
    header, footer { background: #222; color: #fff; text-align: center; padding: 1rem; }
    nav ul { list-style: none; display: flex; justify-content: center; gap: 1rem; padding: 0; }
    nav a { color: #fff; text-decoration: none; }
    nav a:hover { color: #ff9800; }

    .about-container {
      max-width: 900px;
      margin: 2rem auto;
      padding: 1rem;
      background: #fff;
      border-radius: 10px;
      box-shadow: 0 4px 6px rgba(0,0,0,0.1);
    }
    h2 { text-align: center; margin-bottom: 1rem; }
    p { margin-bottom: 1rem; line-height: 1.6; }
    .team {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
      gap: 1.5rem;
      margin-top: 2rem;
    }
    .member {
      text-align: center;
      padding: 1rem;
      border: 1px solid #ddd;
      border-radius: 8px;
    }
    .member img {
      width: 100px; height: 100px; border-radius: 50%; object-fit: cover;
      margin-bottom: .5rem;
    }
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

  <div class="about-container">
    <h2>About Us</h2>
    <p>Welcome to MyBlog, a place where we share insights, stories, and ideas. Our mission is to build a community of learners and creators who are passionate about technology, creativity, and knowledge.</p>
	<p style="text-align:center;font-weight:bold;"><mark>This is the Default page. About & Contact are visible to all. Tutorial & Blog Posts is only for logged-in users.</mark></p>
    <h2>Meet Our Team</h2>
    <div class="team">
      <div class="member">
        <img src="https://picsum.photos/100" alt="Team">
        <h3>John Doe</h3>
        <p>Founder & Blogger</p>
      </div>
      <div class="member">
        <img src="https://picsum.photos/101" alt="Team">
        <h3>Jane Smith</h3>
        <p>Content Writer</p>
      </div>
      <div class="member">
        <img src="https://picsum.photos/102" alt="Team">
        <h3>Alex Johnson</h3>
        <p>Designer</p>
      </div>
    </div>
  </div>

  <footer>
    <p>© 2025 MyBlog | All Rights Reserved</p>
  </footer>
</body>
</html>
