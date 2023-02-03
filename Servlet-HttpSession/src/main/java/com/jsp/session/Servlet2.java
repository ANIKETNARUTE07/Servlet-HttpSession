package com.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("name");
		
		HttpSession httpSession= req.getSession();
          String sname=(String) httpSession.getAttribute("sname");
      	PrintWriter printWriter= resp.getWriter();
		printWriter.print("<html><body><h1>"+"Welcome "+sname+"</h1></body></html>");
		printWriter.print("<a href='Servlet3'>Logout </a>");
		
          
	}
	
	

}
