package co.gargbhoomika;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.gargbhoomika.dao.signdao;

@WebServlet("/sign")

public class sign extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		long phone = Long.parseLong(request.getParameter("phone"));
		String pass = request.getParameter("pass");		
		signdao dao = new signdao();
		if(dao.fill(name,email,phone,pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("useremail", email);
			session.setAttribute("password", pass);
			response.sendRedirect("index.jsp");
		}
	}

}
