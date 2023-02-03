package com.jsp.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession= req.getSession();
		httpSession.removeAttribute("sname");
		httpSession.invalidate();
		
		PrintWriter printWriter= resp.getWriter();
		printWriter.print("<html><body><h1>"+"Successfully Logged Out"+"</h1></body></html>");
		

		
	}

}
