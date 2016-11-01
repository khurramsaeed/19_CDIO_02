package spil;


public class Bank {
	
Field Field = new Field();

Board b1 = new Board();
	
int Balance;
int newBalance;
	
public Bank(){
	
	this.Balance = 1000;
}

//public void getNewBalance(){
//	
//	this.Balance = Field.getEffectValue();
//	
//}

public int setNewBalance(int newBalance){
	this.newBalance = Balance + Field.getEffectValue(); 
	
	return newBalance;
}


}
