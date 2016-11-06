package team;

public class AdminTeam {

	
	public static TeamDAO teamDAO = new TeamDAO();
	
	public static void agregar(String n) {
		
		  teamDAO.agregar(new Team(n));
		
	}
	
}
