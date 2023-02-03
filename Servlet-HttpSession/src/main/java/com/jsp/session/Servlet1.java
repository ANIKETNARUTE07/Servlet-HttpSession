package com.jsp.session;

import java.io.IOException; 

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		
		HttpSession httpSession= req.getSession();
		httpSession.setAttribute("sname", name);
		
		PrintWriter printWriter= resp.getWriter();
		printWriter.print("<html><body><h1>"+"Welcome "+name+"</h1></body></html>");
		printWriter.print("<a href='servlet2'> Go to second servlet </a>");
		
	}

}
