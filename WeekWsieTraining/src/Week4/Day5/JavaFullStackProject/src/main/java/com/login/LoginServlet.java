package com.login;

import dbDao.UserDao;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("pwd");

        if (UserDao.check(email, password)) {
        	
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            
            response.setStatus(HttpServletResponse.SC_OK); //status codde 200
            
            response.sendRedirect("index.jsp");
        } else {
        	
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); //satus code 401
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
