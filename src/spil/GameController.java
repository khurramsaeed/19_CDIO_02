package spil;

import java.util.Scanner;



public class GameController {
	
	Board board = new Board();
	
	Scanner sc = new Scanner(System.in); //flyt
	
	Player p1 = new Player();
	Player p2 = new Player();
	

	
	public static void main(String[] args) {
		GameController game = new GameController();
		game.setPlayerName();
		while(true){
			
		System.out.println(game.p1 + ", press 1 to roll");
		game.sc.nextInt();
		game.playerTurn();
		
		if(game.p1.bank.Balance >= 3000){
			System.out.println(game.p1 + " WON!!");
			System.exit(0);
		
		}
		System.out.println(game.p2+ ", press 2 to roll");
		game.sc.nextInt();
		game.playerTurn2();
		
		if(game.p2.bank.Balance >= 3000){
			System.out.println(game.p2 + " WON!!");
			System.exit(0);
			
		}
		}
	}
	

		public void setPlayerName(){
			
			
			System.out.println("Enter your name Player 1: ");
			p1.getPlayerName(sc.nextLine());
			
			System.out.println("Enter your name Player 2: ");
			p2.getPlayerName(sc.nextLine());
			
			System.out.println("Welcome " + p1 + " and " + p2);
			
			
		}
			
		
		public void playerTurn(){
			
			Cup c2 = new Cup();
			
			System.out.println(p1 + " rolled " + c2.sum());
			
			System.out.println(p1 + " landed on : ");
			
			
			
			board.fields[c2.sum()].landOn(p1);
			
			
		}	
		
		public void playerTurn2(){
			
			Cup c3 = new Cup();
			
			System.out.println(p2 + " rolled " + c3.sum());
			
			System.out.println(p2 + " landed on : ");
			

			
			board.fields[c3.sum()].landOn(p2);
			
			
		}	
		
}