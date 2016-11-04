package spil;

public class Board {

	Field[] fields = new Field[13];

	public Board() {
		
	     fields[2] = new Field(+250, "Tower","You have reached the Tower on your magical journey, in the Tower you found a treasure!", false);
	     fields[3] = new Field(-100, "Crater", "You fell in a crater. Ouch!", false);
		 fields[4] = new Field(+100, "Palace Gates", "You reached the place gates, you recieve a little welcome reward",false);
		 fields[5] = new Field(-20, "Cold Desert", "It's too cold you need a new coat", false);
		 fields[6] = new Field(+180, "Walled city", "You reached the Walled City, you recieve a Reward", false);
		 fields[7] = new Field(0, "Monastary", "You got a free place to sleep. Time to to take a rest!", false);
		 fields[8] = new Field(-70, "Black Cave","You reach the scary Black Cave and get robbed by some bandits who were roaming around the area",false);
		 fields[9] = new Field(+60, "Huts in the Mountain","You find some empty huts in the mountain and find some forgotten cash", false);
		 fields[10] = new Field(-80, "The Werewall (Werewolf - wall)","You get attacked by some werefolf, but you get a chance to run away", true);
		 fields[11] = new Field(-50, "The pit", "You fell in a pit. Ouch!", false);
		 fields[12] = new Field(+650, "Goldmine", "Holy shit is that gold?! You are rich!", false);
		 
	}

}
