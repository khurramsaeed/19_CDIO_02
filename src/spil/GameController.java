package spil;

import java.util.Scanner;



public class GameController {
	
	Field f1 = new Field();
	Field f2 = new Field(+250, "Tower","You have reached the Tower on your magical journey, in the Tower you found a treasure!", false);
	Field f3 = new Field(-100, "Crater", "You fell in a crater. Ouch!", false);
	Field f4 = new Field(+100, "Palace Gates", "You reached the place gates, you recieve a little welcome reward",false);
	Field f5 = new Field(-20, "Cold Desert", "It's too cold you need a new coat", false);
	Field f6 = new Field(+180, "Walled city", "You reached the Walled City, you recieve a Reward", false);
	Field f7 = new Field(0, "Monastary", "You got a free place to sleep. Time to to take a rest!", false);
	Field f8 = new Field(-70, "Black Cave","You reach the scary Black Cave and get robbed by some bandits who were roaming around the area",false);
	Field f9 = new Field(+60, "Huts in the Mountain","You find some empty huts in the mountain and find some forgotten cash", false);
	Field f10 = new Field(-80, "The Werewall (Werewolf - wall)","You get attacked by some werefolf, but you get a chance to run away", true);
	Field f11 = new Field(-50, "The pit", "You fell in a pit. Ouch!", false);
	Field f12 = new Field(+650, "Goldmine", "Holy shit is that gold?! You are rich!", false);
	
	
	Board board = new Board();
	
	Scanner sc = new Scanner(System.in);
	
	Player p1 = new Player();
	Player p2 = new Player();
	
	Bank b1 = new Bank(1000);
	Bank b2 = new Bank(1000);
	
	
	public static void main(String[] args) {
		GameController game = new GameController();
		game.setPlayerName();
		while(true){
			Language.tellPlayer1toRoll(game.p1);
		//System.out.println(game.p1 + ", press 1 to roll");
		game.sc.nextInt();
		game.playerTurn();
		
		if(game.b1.Balance >= 3000){
			Language.tellPlayerWon(game.p1);
			//System.out.println(game.p1 + "WON!!");
			System.exit(0);
		
		}
		Language.tellPlayer2toRoll(game.p2);
		game.sc.nextInt();
		game.playerTurn2();
		
		if(game.b2.Balance >= 3000){
			Language.tellPlayerWon(game.p2);
			System.exit(0);
			
		}
		}
	}

		public void setPlayerName(){
			
			Language.tellPlayer1toEntername();
			p1.getPlayerName(sc.nextLine());
			
			Language.tellPlayer2toEntername();
			p2.getPlayerName(sc.nextLine());
			
			Language.sayWelcome(p1, p2);
			
		}
			
		
		public void playerTurn(){
			
			Cup c2 = new Cup();
			
			Language.tellPlayer1Rolled(p1, c2);
			
			Language.tellPlayer1Field(p1, board, c2);
			
			setNewBalance1(c2.sum());
			
		}	
		
		public void playerTurn2(){
			
			Cup c3 = new Cup();
			
			Language.tellPlayer2Rolled(p2, c3);
			
			Language.tellPlayer2Field(p2, board, c3);
			
			setNewBalance2(c3.sum());
		}	
		
		
		public void setNewBalance1(int z){
			
		switch (board.movePiece(z)) {
		
		case 2:
			b1.addEffect(f2.effect);
			System.out.println(f2);
			System.out.println(b1.Balance);
			
			break;

		case 3:
			b1.addEffect(f3.effect);
			System.out.println(f3);
			System.out.println(b1.Balance);
			break;

		case 4:
			b1.addEffect(f4.effect);
			System.out.println(f4);
			System.out.println(b1.Balance);
			break;

		case 5:
			b1.addEffect(f5.effect);
			System.out.println(f5);
			System.out.println(b1.Balance);
			break;

		case 6:
			b1.addEffect(f6.effect);
			System.out.println(f6);
			System.out.println(b1.Balance);
			break;

		case 7:
			b1.addEffect(f7.effect);
			System.out.println(f7);
			System.out.println(b1.Balance);
			break;

		case 8:
			b1.addEffect(f8.effect);
			System.out.println(f8);
			System.out.println(b1.Balance);
			break;
		case 9:
			b1.addEffect(f9.effect);
			System.out.println(f9);
			System.out.println(b1.Balance);
			break;

		case 10:
			b1.addEffect(f10.effect);
			System.out.println(f10);
			System.out.println(b1.Balance);
			break;

		case 11:
			b1.addEffect(f11.effect);
			System.out.println(f11);
			System.out.println(b1.Balance);
			break;

		case 12:
			b1.addEffect(f12.effect);
			System.out.println(f12);
			System.out.println(b1.Balance);
			break;
			
		}
		
		}

		
		
		public void setNewBalance2(int z){
			
			switch (board.movePiece(z)) {
			
			case 2:
				b2.addEffect(f2.effect);
				System.out.println(f2);
				System.out.println(b2.Balance);
				
				break;

			case 3:
				b2.addEffect(f3.effect);
				System.out.println(f3);
				System.out.println(b2.Balance);
				break;

			case 4:
				b2.addEffect(f4.effect);
				System.out.println(f4);
				System.out.println(b2.Balance);
				break;

			case 5:
				b2.addEffect(f5.effect);
				System.out.println(f5);
				System.out.println(b2.Balance);
				break;

			case 6:
				b2.addEffect(f6.effect);
				System.out.println(f6);
				System.out.println(b2.Balance);
				break;

			case 7:
				b2.addEffect(f7.effect);
				System.out.println(f7);
				System.out.println(b2.Balance);
				break;

			case 8:
				b2.addEffect(f8.effect);
				System.out.println(f8);
				System.out.println(b2.Balance);
				break;
			case 9:
				b2.addEffect(f9.effect);
				System.out.println(f9);
				System.out.println(b2.Balance);
				break;

			case 10:
				b2.addEffect(f10.effect);
				System.out.println(f10);
				System.out.println(b2.Balance);
				break;

			case 11:
				b2.addEffect(f11.effect);
				System.out.println(f11);
				System.out.println(b2.Balance);
				break;

			case 12:
				b2.addEffect(f12.effect);
				System.out.println(f12);
				System.out.println(b2.Balance);
				break;

			}

		
	}
}

