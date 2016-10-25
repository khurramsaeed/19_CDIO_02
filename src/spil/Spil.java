package spil;

public class Spil {

	public static void main(String[] args) {
//		int A = 3;
//		int B = 2;
//		int C = A+B;
//		System.out.println(C);
		
		Terning t1 = new Terning(12);
		t1.roll();
		
		Terning t2 = new Terning();
		t2.roll();
		
		System.out.println(t1.getFacevalue() + ", " + t2.getFacevalue() +"\tSum = " + (t1.getFacevalue()+t2.getFacevalue()));
	}

}