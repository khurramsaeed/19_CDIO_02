package spil;

public class Board {

	private int[] arraylist = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }; 	// Creating integer
																// array list
																// with elements
																// {1,2,3,4,5,6,7,8,9,10,11}
	private int piece = 0; // Create a piece to move on the fields
	private int sum; //

	public Board() {

	}

	public int movePiece(int sum) { // public int method which holds sum & returns sum

		this.sum = sum; //Sum is equal to the parameter.

		if (sum < arraylist[10]) {
			this.piece = sum;
		} else if (sum > arraylist[10]) {
			this.piece = piece + sum;
		}
		return sum;
	}

}
