package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class StudentLogoutServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		//System.out.println(session);
		out.println("<html><body><font color='red' size='5'><center>");
		out.println("<b>Successfully Logged out !! Thank you !!</b>");
		out.println("</center></font></body></html>");
		request.getRequestDispatcher("Student_login.html").include(request,response);
		session.invalidate();
	}
}