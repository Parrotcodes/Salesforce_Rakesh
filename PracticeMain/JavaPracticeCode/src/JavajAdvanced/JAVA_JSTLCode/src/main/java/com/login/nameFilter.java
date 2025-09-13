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
public class nameFilter extends HttpFilter implements Filter {
  
    public nameFilter() {
        super();
    }


	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		String name = req.getParameter("name");
		
		
		if(name.length()>=3) {
			chain.doFilter(req, response);
		}else {
			out.println("Invalid Input! Input name length must be greater than 5 char!");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
