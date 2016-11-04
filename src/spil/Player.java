package spil;

public class Player {
	
	
	String PlayerName; //Not private, it's being used in Language
	Bank bank; //Not private, it's being used in main

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
