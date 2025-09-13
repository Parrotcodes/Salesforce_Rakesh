package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/login")
public class idfilter extends HttpFilter implements Filter {
  
    public idfilter() {
        super();
    }


	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		if(id>=1) {
			chain.doFilter(req, response);
		}else {
			out.println("Invalid input! Id should be positive number");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
