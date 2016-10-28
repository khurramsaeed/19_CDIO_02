package spil;

public class Spil {

	public static void main(String[] args) {

		Terning t1 = new Terning();
		t1.roll();
		
		Terning t2 = new Terning();
		t2.roll();
		
		System.out.println(t1.getFacevalue() + ", " + t2.getFacevalue() +"\tSum = " + (t1.getFacevalue()+t2.getFacevalue()));
	}

}