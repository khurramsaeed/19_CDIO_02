package spil;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	
	String Player1;
	String Player2;

	public Player() {

	}

	public String playerName1() {
		this.Player1 = sc.nextLine();
		
		return Player1;
	}

	public String playerName2() {
		this.Player2 = sc.nextLine();
		
		return Player2;
	}
	
	public void playerBank(){
		
	}

}
