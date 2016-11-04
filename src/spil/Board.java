package spil;

public class Board {
	
	//Creates an array object of Field

	Field[] fields = new Field[13];

	public Board() {
		
		//The effect from every field get added into its place in the array
		
	     fields[2] = new Field(+250, "You landed  on: Tower","You reached the Tower on your magical journey, in the Tower you found a treasure!");
	     fields[3] = new Field(-100,"Crater", "You fell in a crater. Ouch!");
		 fields[4] = new Field(+100,"Palace Gates", "You reached the Palace Gates, you recieve a little welcome reward");
		 fields[5] = new Field(-20,"Cold Desert", "It's too cold you need a new coat");
		 fields[6] = new Field(+180,"Walled city", "You reached the Walled City, you recieve a Reward");
		 fields[7] = new Field(0,"Monastary", "You got a free place to sleep. Time to to take a rest!");
		 fields[8] = new Field(-70,"Black Cave","You reached the scary Black Cave and got robbed by some bandits who were roaming around the area");
		 fields[9] = new Field(+60,"Huts in the Mountain","You found some empty huts in the mountain and some forgotten cash");
		 fields[10] = new Field(-80,"The Werewall","You got attacked by some werewolves, but you got a chance to run away");
		 fields[11] = new Field(-50,"The pit", "You fell in a pit. Ouch!");
		 fields[12] = new Field(+650,"Goldmine", "Holy shit is that gold?! You are rich!");
		 
	}

}
