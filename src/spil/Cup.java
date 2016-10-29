package spil;

public class Cup {
	
	

	Terning t1 = new Terning();
	Terning t2 = new Terning();
	
	public Cup(){
		t1.roll();
		t2.roll();
		
	}
	
	public int getTerning(){
		int z = t1.getFacevalue();
		
		return z;
	
	}
	
	public int getTerning2(){
		int z = t2.getFacevalue();
		
		return z;
	
	}
	
	
	/*public int sum(){
		
	int x = t1.getFacevalue();
	int y = t2.getFacevalue();
	
	return x + y;*/
	
}

