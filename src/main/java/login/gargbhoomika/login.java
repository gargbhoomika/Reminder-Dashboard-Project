package login.gargbhoomika;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.gargbhoomika.dao.logindao;
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		logindao dao = new logindao();
		if(dao.check(email,pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			session.setAttribute("pass", pass);
			response.sendRedirect("alarm.jsp");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
		
	}

}
