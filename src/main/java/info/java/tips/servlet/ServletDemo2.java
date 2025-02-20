package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/ServletDemo2")
public class ServletDemo2 extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		ServletContext app = getServletContext();
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Congratulations!!"+ app.getAttribute("Name")+"<br/>");
		out.println("You have scored = "+ app.getAttribute("Percentage"));
	}
}
