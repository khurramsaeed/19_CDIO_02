package spil;



public class Language {
	
	GameController game = new GameController();
	
	public Language(){
		
	}

	public static void tellPlayerWon(Player p) {
		System.out.println(p.PlayerName+" WON!!");
		
	}

	public static void tellPlayer1toRoll(Player p1) {
		System.out.println(p1.PlayerName+", press 1 to roll");
		
	}
	public static void tellPlayer2toRoll(Player p2) {
		System.out.println(p2.PlayerName+", press 2 to roll");
		
	}

	public static void tellPlayer1toEntername() {
		System.out.println("Enter your name Player 1: ");
		
	}
	public static void tellPlayer2toEntername() {
		System.out.println("Enter your name Player 2: ");
}

	public static void sayWelcome(Player p1, Player p2) {
		System.out.println("Welcome " + p1 + " and " + p2);
		
	}
	
	public static void tellPlayer1Rolled(Player p1, Cup c2){
		System.out.println(p1 + " rolled " + c2.sum());
	
	}

	public static void tellPlayer1Field(Player p1, Board board, Cup c2) {
		System.out.println(p1 + " landed on field: " + board.movePiece(c2.sum()));
		
	}
	public static void tellPlayer2Rolled(Player p2, Cup c3){
		System.out.println(p2 + " rolled " + c3.sum());
	
	}

	public static void tellPlayer2Field(Player p2, Board board, Cup c3) {
		System.out.println(p2 + " landed on field: " + board.movePiece(c3.sum()));
		
	}
}