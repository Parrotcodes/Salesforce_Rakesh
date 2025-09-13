<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="icon" href="fav.png"/>
<style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
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
<br/><br/>
    <div style="padding:20px">
        <h2>Welcome to My Website</h2>
        <p>Click the links above to navigate.</p>
		    
		<h1>Welcome ${username}</h1>
		<form action="logout" method="post">
			<input type="submit" value="logout">
		</form>
		
		<br/>
		<h4>EL Tag</h4>
		${students}
		<br/>
		
		<h4>JSTL Tags - jstl/core </h4>
		<c:out value="Hello Rakesh"></c:out><br/>
		
		<ul><!-- JSTL Taglib jstl/core -->
			<c:forEach items="${students}" var="s">
				<li>${s.name}</li><br/>
			</c:forEach>
		</ul>	
		
		<h4>DB connection -- JSTL/sql</h4>
		<!-- DB Connection -->
			<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/myjdbcdb" user="root" password="" />
			
			<sql:query var="rs" dataSource="${db}">select * from customer</sql:query>
			
			<c:forEach items="${rs.rows}" var="data">
				<br/><br/>
				Id: <c:out value="${data.customerid}"></c:out> <br/>
				Name: <c:out value="${data.cname}"></c:out> <br/>
				Email: <c:out value="${data.cemail}"></c:out> <br/>
				Age: <c:out value="${data.cage}"></c:out> <br/>
				Phone: <c:out value="${data.cphone}"></c:out> <br/>
				Married:<c:out value="${data.cmarried}"></c:out> <br/>
				Gender:<c:out value="${data.cgender}"></c:out>
			</c:forEach>
			<br/>
		
		<h4>JSTL - Functions</h4>
		
		<c:set var="str" value="Java is Powerful and Easy!"></c:set>
		Value: <c:out value="${str}"></c:out> <br/>
		Length: <c:out value="${f:length(str)}"></c:out> <br/>
		EndsWith: <c:out value="${f:endsWith(str,'Easy!')}"></c:out><br/>
		Contains: <c:out value="${f:contains(str,'and')}"></c:out><br/>
		toLowerCase: <c:out value="${f:toLowerCase(str)}"></c:out><br/>
		toUppercase: <c:out value="${f:toUpperCase(str) }"></c:out><br/>
		split: <c:forEach items="${f:split(str,' ')}" var="s">
					<br/>
					${s}
				</c:forEach>
				<br/>
		IndexOf: <c:out value="${f:indexOf(str,'is')}"></c:out>
		etc.. like if,isthere,join,replacewith more...........
	</div>
</body>
</html>