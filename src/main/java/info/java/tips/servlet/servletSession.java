package info.java.tips.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.Date;

@WebServlet("/servletSession")
public class servletSession extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		HttpSession session = request.getSession(true);
		Integer ct = (Integer) session.getAttribute("ct");
		if(ct == null)
		{
			ct = new Integer(1);}
		else { ct = new Integer(ct.intValue()+1); }
		session.setAttribute("count", ct);
		out.println("Session Details: ");
		out.println("<br/>");
		out.println("You have visited this page: "+ ct + ((ct.intValue()==1)? "time" : " times"));
		out.println("<br/>");
		out.println("Session ID: "+ session.getId());
		out.println("<br/>");
		out.println("New Session: "+ session.isNew());
		out.println("<br/>");
		out.println("creation Time: "+ new Date(session.getCreationTime()));
		out.println("<br/>");
		out.println("Last Access Time:" + new Date(session.getLastAccessedTime()));
		
	}
}
