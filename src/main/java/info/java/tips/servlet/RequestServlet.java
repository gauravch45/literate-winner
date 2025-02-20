package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		java.util.Date date = new java.util.Date();
		out.println("Current Date & Time: " +date.toString());
		out.println("<h3>Request Information Example</h3>");
		out.println("Method: " + request.getMethod()+"<br>");
		out.println("Request URI: "+ request.getRequestURI()+"<br>");
		out.println("Protocol: "+ request.getProtocol()+"<br>");
		out.println("PathInfo: "+ request.getPathInfo()+"<br>");
		out.println("Remote Address: "+ request.getRemoteAddr());
	
	}

}
