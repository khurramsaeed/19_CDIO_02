package spil;


import java.lang.reflect.Array;

public class Board {

	
	int[] arraylist = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	int piece = 0;
	int sum;

	public Board() {
 
	}
	

	public int movePiece(int sum) {
		
		this.sum = sum;
		
		if(sum > arraylist[10]){
		this.piece = sum;	
		}
		else if(sum < arraylist[10]){
			this.piece = piece + sum;
		}
		return sum;
}

}
