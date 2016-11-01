package spil;


import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	
	String PlayerName;

	public Player() {

	}

	public String getPlayerName(String PlayerName) {
		this.PlayerName = PlayerName;
		
		return PlayerName;
	}


}
