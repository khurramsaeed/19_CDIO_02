package spil;

public class Player {
	
	String PlayerName;

	public Player() {

	}

	public String getPlayerName(String PlayerName) {
		this.PlayerName = PlayerName;
		return PlayerName;
	}
	
	public String toString (){
		
		return PlayerName;
	}


}
