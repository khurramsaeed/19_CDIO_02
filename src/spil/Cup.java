package spil;

public class Cup {
	
	//Oprettelse af Objekter
	//�ndre type terning, Dice(terningSt�rrelse)
	Dice t1 = new Dice();
	Dice t2 = new Dice();

	public Cup() {
		t1.roll();
		t2.roll();

	}


	public int sum() {

		int x = t1.getFacevalue();
		int y = t2.getFacevalue();
// mangler y
		return x;

	}
}
