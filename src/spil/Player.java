package spil;

public class Player {
	
	
	String PlayerName; //Not private, it's being used in Language
	Bank bank; //Not private, it's being used in main

	public Player() {// Create constructor, returns nothing
		bank  = new Bank(1000);
	}
     
	public String getPlayerName(String PlayerName) {// Used to get Playername 
		this.PlayerName = PlayerName;
		return PlayerName;
	}
	//Used to get Playername
	public String toString (){
		
		return PlayerName;
	}
	// Used to get bank value
	public Bank getBank(){
		
		return bank;
	}

}
