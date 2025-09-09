package com.login;

import dbDao.UserDao;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class UserRegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String marital = request.getParameter("marital");

        if (UserDao.register(username, email, password, gender, marital)) {
        	
            response.setStatus(HttpServletResponse.SC_CREATED); // success -> status code 200
            response.sendRedirect("login.jsp?msg=registered");
            
        } else {
        	
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); //error -> something went wrong status code - 401
            response.sendRedirect("register.jsp?error=1");
        }
    }
}
