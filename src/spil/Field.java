package spil;


public class Field {
	
	Bank bank = new Bank();
	Bank bank2 = new Bank();
	
	private int effect;
	private int effectValue;
	private String Details;
	private String Name;
	private boolean extraTurn; 

	public Field(){
		
	}
	public Field(int effect, String Name, String Details, boolean extraTurn) {
		this.effect = effect;
		this.Name = Name;
		this.Details = Details;
	}

	public int getEffectValue() {
		return effectValue;
	}
	public String getName() {
		return Name;
	}
	public String getDetails() {
		return Details;
	}
	public boolean extraTurn() {
		return true;
	}
	
	public void effectValue(){
		
		this.effectValue = bank.Balance + effect;
		this.effectValue = bank2.Balance + effect;
	}
	
	public String toString(){
		
		
		
		
		return "Effect: " + effect + "\n" +
			    "Name: " + Name + "\n" + 
				"Details: " + Details + "\n";
	}
}
	