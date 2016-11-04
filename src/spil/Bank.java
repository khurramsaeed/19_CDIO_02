package spil;


public class Bank {
	
int Balance;
	
	public Bank(int b){
		Balance = b;
	}

	
	public String toString () {
		return ("("+Balance+")");
	}


	public void addEffect(int x){
		Balance = Balance + x;
		
	}
	
	

	
}
