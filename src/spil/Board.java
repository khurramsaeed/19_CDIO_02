package spil;

public class Board {

	Cup r1 = new Cup();
	int[] arraylist = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
	

	public Board() {

	}
	

	public int Prik() {

		// Array shifting
		for (int i = 0; i < r1.sum(); i++) {
			for (int j = arraylist.length - 1; j > 0; j--) {
				int temp = arraylist[j];
				arraylist[j] = arraylist[j - 1];
				arraylist[j - 1] = temp;
			}
		}

		for (int k = 1; k < arraylist.length; k++) {
			System.out.println(arraylist[k + 0] + " ");
		}

		return arraylist[r1.sum()];
	}
	
	public int feltEffect(){
		
		
		
		
		return 300;
	}
}
