package info.java.tips.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/CreateCookieServlet")
public class CreateCookieServlet extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)
{
try
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String name=request.getParameter("uname");
out.print("Welcome "+name);
out.print(", Submit your data for GetCookieServlet");
//create cookie object
Cookie usercookie=new Cookie("uname",name);
//add cookie in the response
response.addCookie(usercookie);
out.println("<form action='http://localhost:8080/Web_Devlopment_01/GetCookieServlet' method='post'>");
out.println("<input type='submit' value='Submit data'>");
out.println("</form>");
}
catch(Exception e){System.out.println(e);}
}
}
