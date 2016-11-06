package team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import database.Conexion;

public class TeamDAO {

	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	Conexion conexion = null;
	
	public void agregar(Team t){  
		
		try { conn = Conexion.getConexion();
			String query = "INSERT INTO team (name) values (?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, t.getName());
			ps.executeUpdate();
		}
		catch(Exception e){	e.printStackTrace();}
		finally{
			try { rs.close(); } catch (Exception e) { /* ignored */ }
		}
	}
}
