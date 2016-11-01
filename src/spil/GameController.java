package spil;

public class GameController {

	public static void main(String[] args) {

		Player p = new Player();
		
		Cup r2 = new Cup();
		
		Field f2 = new Field(250, "Tower", "You have reached the Tower on your magical journey, in the Tower you found a treasure!", false);
		Field f3 = new Field(-100, "Crater", "You fell in a crater. Ouch!", false);
		Field f4 = new Field(100, "Palace Gates", "You reached the place gates, you recieve a little welcome reward", false);
		Field f5 = new Field(-20, "Cold Desert", "It's too cold you need a new coat", false);
		Field f6 = new Field(180, "Walled city", "You reached the Walled City, you recieve a Reward", false);
		Field f7 = new Field(0, "Monastary", "You got a free place to sleep. Time to to take a rest!", false);
		Field f8 = new Field(-70, "Black Cave", "You reached the scary Black Cave and get robbed by some bandits who were roaming around the area", false);
		Field f9 = new Field(60, "Huts in the Mountain", "You find some empty huts in the mountain and find some forgotten cash", false);
		Field f10 = new Field(-80, "The Werewall (Werewolf - wall)", "You get attacked by some werefolf, but you get a chance to run away", true);
		Field f11 = new Field(-50, "The pit", "You fell in a pit. Ouch!", false);
		Field f12 = new Field(650, "Goldmine", "Holy shit is that gold?! You are rich!", false);
		

		Board b1 = new Board();
	
		
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
		

		
		//Test af cup/dice
		System.out.println(p.Player1 + " slog " + r2.sum());

		
		
		System.out.println(p.Player1 + " landte på " + b1.movePiece(r2.sum()));
		
		
		
		switch (b1.movePiece(r2.sum())) {
		
		case 2: f2.effectValue(); 
		System.out.println("Dine coins er nu " + f2.getEffectValue());
		break;
		
		case 3: f3.effectValue(); 
		System.out.println("Dine coins er nu " + f3.getEffectValue());
		break;
		
		case 4: f4.effectValue(); 
		System.out.println("Dine coins er nu " + f4.getEffectValue());
		break;
			
		case 5: f5.effectValue(); 
		System.out.println("Dine coins er nu " + f5.getEffectValue());
		break;
			
		case 6: f6.effectValue(); 
		System.out.println("Dine coins er nu " + f6.getEffectValue());
		break;
			
		case 7: f7.effectValue(); 
		System.out.println("Dine coins er nu " + f7.getEffectValue());
		break;
			
		case 8: f8.effectValue(); 
		System.out.println("Dine coins er nu " + f8.getEffectValue());
		break;
			
		case 9: f9.effectValue(); 
		System.out.println("Dine coins er nu " + f9.getEffectValue());
		break;
		
		case 10: f10.effectValue(); 
		System.out.println("Dine coins er nu " + f10.getEffectValue());
		break;
		
		case 11: f11.effectValue(); 
		System.out.println("Dine coins er nu " + f11.getEffectValue());
		break;
		
		case 12: f12.effectValue(); 
		System.out.println("Dine coins er nu " + f12.getEffectValue());
		break;

		}
		
		
	}

}
