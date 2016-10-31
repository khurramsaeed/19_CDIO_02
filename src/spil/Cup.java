package spil;


public class Cup {
	
	//Oprettelse af Objekter
	//Ændre type terning, Dice(terningStørrelse)
	Dice t1 = new Dice(6);
	Dice t2 = new Dice();

	public Cup() {
		t1.roll();
		t2.roll();

	}


	public int sum() {

		int x = t1.getFacevalue();
		int y = t2.getFacevalue();
		
		return x + y;

	}
	
//	public int getSum (){
//		
//		sum()
//	}
}
