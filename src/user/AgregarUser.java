package user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agregarUser")
public class AgregarUser extends HttpServlet {

	UserDAO userDAO = new UserDAO();
	  public void doPost( HttpServletRequest request, 
              HttpServletResponse response) 
              throws IOException, ServletException {


		  String n = request.getParameter("name");
		  String d = request.getParameter("pass");
		  
		  userDAO.agregar(new User(n, d));
		  RequestDispatcher view = request.getRequestDispatcher("general/Mensaje.jsp");
		    request.setAttribute("mensaje","Usuario creado satisfactoriamente");
		    view.forward(request, response); 
		  }
	  
}
