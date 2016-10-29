package spil;

public class Cup {
	
	

	Dice t1 = new Dice();
	Dice t2 = new Dice();
	
	public Cup(){
		t1.roll();
		t2.roll();
		
	}
	
	public int getDice(){
		int z = t1.getFacevalue();
		
		return z;
	
	}
	
	public int getDice2(){
		int z = t2.getFacevalue();
		
		return z;
	
	}
	
	
	/*public int sum(){
		
	int x = t1.getFacevalue();
	int y = t2.getFacevalue();
	
	return x + y;*/
	
}

