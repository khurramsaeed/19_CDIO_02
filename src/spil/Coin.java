package spil;

public class Coin {
	
Board b1 = new Board();
	
int Beholdning;
	
public Coin(){
	
	this.Beholdning = 1000;
}

public int getFeltEffect(){
	
	Beholdning = Beholdning + b1.feltEffect();
	
	return Beholdning;
}

}
