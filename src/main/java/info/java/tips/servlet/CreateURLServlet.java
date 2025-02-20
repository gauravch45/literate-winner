package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CreateURLServlet")
public class CreateURLServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String password = request.getParameter("pwd");
		if(password.equals("password")) {
			response.sendRedirect("FetchURLServlet?username="+ name);
			}
		else
		{out.println("Password is incorrect");}
		}
}