package spil;

public class GameController {

	public static void main(String[] args) {

		Player p = new Player();
		
		Cup r2 = new Cup();
		
		Field f7 = new Field();

		Board b1 = new Board();
		
		Coin c1 = new Coin();
		
		//Test af oprettelse af Player
		System.out.println("Enter your name Player1: ");
		p.playerName1();
		
		System.out.println("Enter your name Player2: ");
        p.playerName2();
        
		System.out.println("Welcome "+ p.Player1 +" and "+ p.Player2);

		//Midlertidlig test af board
		//System.out.println(b1.Prik());
		
		//Test af coin
		//System.out.println(p.Player1 + " og " + p.Player2 + " Jeres startsbeholdning er " + c1.getFeltEffect());
		
		
		System.out.println(c1.getFeltEffect());
		
		//Test af cup/dice
		System.out.println(p.Player1 + " slog " + r2.sum());

		
		
		System.out.println(b1.movePiece(r2.sum()));
		
		
	}

}