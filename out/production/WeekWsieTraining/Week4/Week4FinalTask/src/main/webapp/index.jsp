
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" />
</head>
<body>

	<!-- Navbar -->
  <header>
    <h1>MyBlog</h1>
    <nav>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="about.jsp">About</a></li>
        <li><a href="contact.jsp">Contact</a></li>
        
        <%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
		}
%>
        
        <% if (session.getAttribute("username") != null) { %>
        <li><a href="videos.jsp" target="_blank">Tutorials</a></li>
        <li><a href="logout">Logout</a></li>
      <% } else { %>
        <li><a href="login.jsp">Login</a></li>
      <% } %>
      </ul>
    </nav>
  </header>

  <!-- Hero Section -->
  <section class="hero">
    <h2>Welcome to My Blog</h2>
  </section>
	

  <!-- Blog Section -->
  <section class="blog-container">
    <div class="blog-card">
      <img src="https://picsum.photos/400/200" alt="Blog">
      <div class="content">
        <h3>Blog Title One</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vitae eros eget tellus.</p>
        <a href="#">Read More →</a>
      </div>
    </div>

    <div class="blog-card">
      <img src="https://picsum.photos/401/200" alt="Blog">
      <div class="content">
        <h3>Blog Title Two</h3>
        <p>Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem.</p>
        <a href="#">Read More →</a>
      </div>
    </div>

    <div class="blog-card">
      <img src="https://picsum.photos/402/200" alt="Blog">
      <div class="content">
        <h3>Blog Title Three</h3>
        <p>Curabitur sit amet mauris morbi in dui quis est pulvinar ullamcorper. Nulla facilisi.</p>
        <a href="#">Read More →</a>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer>
    <p>© 2025 MyBlog | All Rights Reserved</p>
  </footer>
</body>
</html>