package info.java.tips.servlet;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
	try
	{
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	Cookie[] c = request.getCookies();
	out.println("Welcome in SOCIS "+c[1].getValue());
	}
	catch(Exception e){System.out.println(e);}
	}
	
}