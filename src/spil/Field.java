package spil;


public class Field {
	
	Coin c1 = new Coin();
	
	private int effect;
	private int effectValue;

	public Field(){
		
	}
	public Field(int effect) {
		this.effect = effect;
	}

	public int getEffectValue() {
		return effectValue;
	}
	
	public void effectValue(){
		
		this.effectValue = c1.Beholdning + effect;
		
	}
}
	