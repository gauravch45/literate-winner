package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/ServletDemo1")
public class ServletDemo1 extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletContext app = getServletContext();		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user");
		out.println("Using ServletContext object to set and read attributes");
		out.println("<br/>");
		int percent = Integer.parseInt(req.getParameter("percent"));
		app.setAttribute("Name",name);
		app.setAttribute("Percentage", percent);
		if(percent > 80 ) {
			RequestDispatcher rd= app.getRequestDispatcher("/ServletDemo2");
			rd.forward(req, res);
		}
		else {
			out.println("Data is incorrect!!");
			out.println("<br/>");
			out.println("Fill the form again. Thank you!!");
			RequestDispatcher rd= app.getRequestDispatcher("/GETandSETattribute/Login.html");
			rd.include(req, res);
		}
	}
}
