package spil;

public class Dice {
	private int facevalue;
	private int sides;

	public Dice(){ //Constructor, defines dice size, set to 6 & can be modified to 12
		this(6);
	}
	public Dice(int sides) { //Method Dice with parameter sides, sets global sides = local sides
		this.sides = sides;
	}

	public int getFacevalue() { //
		return facevalue;
	}
	
	public void roll(){ //roll() function with math Random 
		this.facevalue = (int)(Math.random()*sides) +1;
	}
	
	public int testRollValue(){ //testMethod for Junit test test/DiceTest.java
		this.facevalue = (int)(Math.random()*sides) +1;
		return facevalue;
	}
}
