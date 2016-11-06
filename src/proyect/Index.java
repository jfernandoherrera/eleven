package proyect;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class Index extends HttpServlet{
	


	public void init() throws ServletException  { }
	public void doGet( HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException {
		RequestDispatcher view = request.getRequestDispatcher("team/CreateTeam.jsp");

		view.forward(request, response); 
	}
}
