package player;

import user.User;

public class Player {

	private String id;
	private String number;
	private User user;
	
	public Player(String id, String number, User user) {
	
		this.id = id;
		this.number = number;
		this.user = user;
		
	}
	
	public User getUser() {
		
		return user;
		
	}
	
	public String getId() {
		
		return id;
		
	}
	
	public String number() {
		
		return number;
		
	}
	
}
