package info.java.tips.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE> Servlet Testing </TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("Welcome to IGNOU Family.. BOI!!!");
		out.println("</BODY></HTML>");
		
	}
}
