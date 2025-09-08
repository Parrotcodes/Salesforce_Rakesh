package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        if(uname.contains("admin") && pwd.contains("admin")) {
            // Login success
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);

            response.sendRedirect("index.jsp");
        }
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String query = "SELECT * FROM loginusers WHERE username=? AND password=?";
        String url = "jdbc:postgresql://localhost:5432/mydb";
        String dbuser ="postgres";
        String dbpwd = "root";

	        try {
	            // Load PostgreSQL Driver
	            Class.forName("org.postgresql.Driver");

	            // Connect to PostgreSQL
	            Connection con = DriverManager.getConnection(url, dbuser, dbpwd);

	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, uname);
	            ps.setString(2, pwd);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                // Login success
	                HttpSession session = request.getSession();
	                session.setAttribute("username", uname);

	                // Set HTTP Status 200 (OK)
	                response.setStatus(HttpServletResponse.SC_OK);
	                response.sendRedirect("index.jsp");

	            } else {
	                // ❌ Login fail
	                // Set HTTP Status 401 (Unauthorized)
	                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	                response.sendRedirect("login.jsp");
	            }

	            con.close();
	        } catch (Exception e) {
	            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	            out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
	        }
	}



}
