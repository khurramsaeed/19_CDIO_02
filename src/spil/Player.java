package spil;


import java.util.Scanner;

public class Player {
	
	Scanner sc = new Scanner(System.in);
	String PlayerName;
	Bank bank;

	public Player() {
		bank  = new Bank(1000);
	}

	public String getPlayerName(String PlayerName) {
		this.PlayerName = PlayerName;
		return PlayerName;
	}
	
	public String toString (){
		
		return PlayerName;
	}
	
	public Bank getBank(){
		
		return bank;
	}


}
