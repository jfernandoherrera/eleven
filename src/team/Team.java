package team;

import java.util.ArrayList;

import player.Player;

public class Team {

	private String id;
	private String name;
	private ArrayList<Player> players;
	
	public Team(String id, String name, ArrayList<Player> players) {
		
		this.id = id;
		this.name = name;
		this.players = players;
		
	}
	
	public Team(String id, String name) {
		
		this.id = id;
		this.name = name;
		players = new ArrayList();
		
	}
	
	public Team(String name) {
		
		this.name = name;
		players = new ArrayList();
		
	}
	
	public void addPlayer(Player player) {
		
		players.add(player);
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
}
