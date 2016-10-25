package spil;

public class Terning {
	private int facevalue;
	private int sides;

	public Terning(){
		this(6);
	}
	public Terning(int sides) {
		this.sides = sides;
	}

	public int getFacevalue() {
		return facevalue;
	}
	
	public void roll(){
		this.facevalue = (int)(Math.random()*sides) +1;
	}
}
