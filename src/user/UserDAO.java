package user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import database.Conexion;
public class UserDAO {

	public User getUser(String name) {
		
		return new User("","","");
	}
	


	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	
	public void agregar(User u){  
		
		try { conn = Conexion.getConexion();
			String query = "INSERT INTO user (name, pass) values (?, ?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, u.getName()); ps.setString(2, u.getPass());
			ps.executeUpdate();
		}
		catch(Exception e){	e.printStackTrace();}
		finally{
			try { rs.close(); } catch (Exception e) { /* ignored */ }
		}
	}
	

	
}
