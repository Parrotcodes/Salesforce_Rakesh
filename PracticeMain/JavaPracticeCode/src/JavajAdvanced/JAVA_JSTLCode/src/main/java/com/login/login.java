package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public login() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		
		//out.println("In login servlet");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		
		//out.println("Welcome to Guest Account, Mr/Mrs. "+name);
		HttpSession session = request.getSession();
		session.setAttribute("username", name);
		
		if( name.equals("admin") && password.equals("admin123")) {
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
PrintWriter out = response.getWriter();
		
		//out.println("In login servlet");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		
		//out.println("Welcome to Guest Account, Mr/Mrs. "+name);
		HttpSession session = request.getSession();
		session.setAttribute("username", name);
		
		if( name.equals("admin") && password.equals("admin123")) {
			response.sendRedirect("index.jsp");
		}else {
			out.println("Invalid inputs");
			response.sendRedirect("login.jsp");
			
		}
	}

}
