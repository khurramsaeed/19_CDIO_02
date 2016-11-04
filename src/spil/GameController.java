package spil;

public class GameController {
	
	Board board = new Board();
	
	static Player p1 = new Player();
	static Player p2 = new Player();
	
	
	public static void main(String[] args) {
		
		GameController game = new GameController();
		game.setPlayerName();
		while(true){
			
		Language.tellPlayer1toRoll(p1);
		Language.sc.nextInt();
		game.playerTurn();
		
		if(p1.bank.Balance >= 3000){
			Language.tellPlayerWon(p1);
			System.exit(0);
			}
		
		Language.tellPlayer2toRoll(p2);
		Language.sc.nextInt();
		game.playerTurn2();
		
		if(p2.bank.Balance >= 3000){
			Language.tellPlayerWon(p2);
			System.exit(0);
			}
		}
	}
	
	//Sets the player name.

	public void setPlayerName(){
			
		Language.tellPlayer1toEntername();
		p1.getPlayerName(Language.sc.nextLine());
			
		Language.tellPlayer2toEntername();
		p2.getPlayerName(Language.sc.nextLine());
			
		Language.sayWelcome(p1, p2);
			
		}
		
	//Starts player turn
		
	public void playerTurn(){
			
		Cup c2 = new Cup();
			
		Language.tellPlayer1Rolled(p1, c2);
			
		board.fields[c2.sum()].landOn(p1);
		}
		
	
	//Starts player turn
	
	public void playerTurn2(){
			
		Cup c3 = new Cup();
			
		Language.tellPlayer2Rolled(p2, c3);
			
		board.fields[c3.sum()].landOn(p2);
		}	
	}