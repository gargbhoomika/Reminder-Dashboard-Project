package delete.reminder;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import delete.reminder.dao.deletedao;

@WebServlet("/del")

public class delete extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession session = request.getSession();
		String email = session.getAttribute("email").toString();
		int time = Integer.parseInt(request.getParameter("time"));
		String date = request.getParameter("date");
		deletedao dao = new deletedao();
		System.out.println("Entered delete.java");
		if(dao.delete(email, time, date))
		{
			System.out.println("ENtered dao delete true");
			response.sendRedirect("showreminder.jsp");
		}
	}
}
