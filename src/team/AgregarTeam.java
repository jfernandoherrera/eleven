package team;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agregarTeam")
public class AgregarTeam extends HttpServlet {

	
	  public void doPost( HttpServletRequest request, 
              HttpServletResponse response) 
              throws IOException, ServletException {


		  String n = request.getParameter("name");
		  
		  AdminTeam.agregar(n);
		 
		  RequestDispatcher view = request.getRequestDispatcher("general/Mensaje.jsp");
		    request.setAttribute("mensaje","Equipo creado satisfactoriamente");
		    view.forward(request, response); 
		  }
	  
}
