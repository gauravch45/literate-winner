package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet("/RequestDispatcherServlet")
public class RequestDispatcherServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");
		if(name.equals("Ram")&&pass.equals("ballon"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeStudentServlet");
			rd.forward(request, response);
		}
		else {
			out.println("Username or Password is incorrect. Please try again!!!");
			RequestDispatcher rd = request.getRequestDispatcher("http://localhost:8080/Web_Devlopment_01/ServletCollaboration/LoginForm.html");
			rd.include(request, response);
		}
		
	}

}
