package spil;


public class Bank {

int Balance;
	
	public Bank(int b){ //Create constructor, returns nothing
		Balance = b;
	}

	
	public String toString () { //toString method returns Balance as a String
		return ("("+Balance+")");
	}


	public void addEffect(int x){ //sets old Balance equals to Balance + new Balance
		Balance = Balance + x;
		
	}
	
	

}