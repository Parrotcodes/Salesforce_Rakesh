<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tutotrials</title>
<link rel="icon" href="fav.png"/>

<style>
        /* Navbar styling */
        .navbar {
            width: 100%;
            background-color:  #222;
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
			background-color:  #223; 
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
<%
	response.setHeader("cache-control","no-cache, no-store, must-revalidate");

	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>
   <div class="navbar">
        <a href="index.jsp">Home</a>
        <a href="about.jsp">About</a>
        <a href="contact.jsp">Contact</a>
        <a href="videos.jsp" target="_blank">Tutorials</a>
        <a href="logout" >Logout</a>
    </div>
<br/><br/><br/><br/>
<h1>Best youtube Channels for Salesforce Beginner</h1>

<h1>Core Java</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?si=LQBIIeJUIgKfPLfO&amp;list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5" title="YouTube video player" ></iframe>

<h1>Servlet + JSP + JSLT</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=Y9BehfGYsvkyAv4S" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

<h1>Salesforce</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?si=CkyM5GLdRnEV98Ml&amp;list=PLWgzSrReOBh4P7kQyCJVH7mdmCWw0HXfi" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/WBLuB1lQ3zE?si=pstiQ-2awb5WKr69" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

<h1>JavaScript + Ajax</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/videoseries?si=paGkH4k0Ma4rsLYb&amp;list=PLZPZq0r_RZOO1zkgO4bIdfuLpizCeHYKv" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe width="560" height="315" src="https://www.youtube.com/embed/82hnvUYY6QA?si=B5G-3efKXkEye1xS" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

<h1>C Language</h1>
<iframe width="560" height="315" src="https://www.youtube.com/embed/xND0t1pr3KY?si=k6eKO_hCNMZuXH8s" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

</body>
</html>