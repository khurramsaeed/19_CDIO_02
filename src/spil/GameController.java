package spil;

import java.util.Scanner;



public class GameController {
	
	Field f1 = new Field();
	Field f2 = new Field(250, "Tower","You have reached the Tower on your magical journey, in the Tower you found a treasure!", false);
	Field f3 = new Field(-100, "Crater", "You fell in a crater. Ouch!", false);
	Field f4 = new Field(100, "Palace Gates", "You reached the place gates, you recieve a little welcome reward",false);
	Field f5 = new Field(-20, "Cold Desert", "It's too cold you need a new coat", false);
	Field f6 = new Field(180, "Walled city", "You reached the Walled City, you recieve a Reward", false);
	Field f7 = new Field(0, "Monastary", "You got a free place to sleep. Time to to take a rest!", false);
	Field f8 = new Field(-70, "Black Cave","You reached the scary Black Cave and get robbed by some bandits who were roaming around the area",false);
	Field f9 = new Field(60, "Huts in the Mountain","You find some empty huts in the mountain and find some forgotten cash", false);
	Field f10 = new Field(-80, "The Werewall (Werewolf - wall)","You get attacked by some werefolf, but you get a chance to run away", true);
	Field f11 = new Field(-50, "The pit", "You fell in a pit. Ouch!", false);
	Field f12 = new Field(650, "Goldmine", "Holy shit is that gold?! You are rich!", false);
	
	
	Player p = new Player();

	Board b1 = new Board();
	
	Scanner sc = new Scanner(System.in);
	
	String Player1;
	String Player2;
	
	
	
	
	public static void main(String[] args) {
		GameController game = new GameController();
		game.setPlayerName();
		while(true){
			
		System.out.println("Press 1 to roll");
		game.sc.nextInt();
		game.playerTurn();
		
		if(game.f1.effectValue() >= 3000){
			System.out.println("You won");
		
		}
		System.out.println("Press 2 to roll");
		game.sc.nextInt();
		game.playerTurn2();
		
		if(game.f1.effectValue() >= 3000){
			System.out.println("You won");
			
		}
		}
	}
	

		public void setPlayerName(){
			
			
			System.out.println("Enter your name Player1: ");
			this.Player1 = p.getPlayerName(sc.nextLine());
			
			System.out.println("Enter your name Player2: ");
			this.Player2 = p.getPlayerName(sc.nextLine());
			
			System.out.println("Welcome " + Player1 + " and " + Player2);
			
			
		}
			
		
		public void playerTurn(){
			
			Cup c2 = new Cup();
			
			System.out.println(Player1 + " rolled " + c2.sum());
			
			System.out.println(Player1 + " landed on field: " + b1.movePiece(c2.sum()));
			
			setNewBalance(c2.sum());
			
		}	
		
		public void playerTurn2(){
			
			Cup c3 = new Cup();
			
			System.out.println(Player2 + " rolled " + c3.sum());
			
			System.out.println(Player2 + " landed on field: " + b1.movePiece(c3.sum()));
			
			setNewBalance(c3.sum());
		}	
		
		
		public void setNewBalance(int z){
			f1.bank.setSum(1000);
		switch (b1.movePiece(z)) {
		
		case 2:
			f1.bank.addsum(f2.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 3:
			f1.bank.addsum(f3.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 4:
			f1.bank.addsum(f4.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 5:
			f1.bank.addsum(f5.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 6:
			f1.bank.addsum(f6.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 7:
			f1.bank.addsum(f7.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 8:
			f1.bank.addsum(f8.effectValue());
			System.out.println(f1.bank.getbalance());
			break;
		case 9:
			f1.bank.addsum(f9.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 10:
			f1.bank.addsum(f10.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 11:
			f1.bank.addsum(f11.effectValue());
			System.out.println(f1.bank.getbalance());
			break;

		case 12:
			f1.bank.addsum(f12.effectValue());
			System.out.println(f1.bank.Balance);
			break;

		}


	}
}

