package spil;


public class Dice {
	private int facevalue;
	private int sides;

	public Dice(){
		this(6);
	}
	public Dice(int sides) {
		this.sides = sides;
	}

	public int getFacevalue() {
		return facevalue;
	}
	
	public void roll(){
		this.facevalue = (int)(Math.random()*sides) +1;
		
	}
	
	public int testRollValue(){
		this.facevalue = (int)(Math.random()*sides)+1;
		return facevalue;
		//til jUnit test af Dice. Testen tjekker om sandsynlighed for at slå de enkelte tal er lige stor.
	}
}
