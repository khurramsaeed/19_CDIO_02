package spil;


public class Field {
	
	Bank bank = new Bank();
	
	int effect;
	int effectValue;
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
	
	public int effectValue(){
		
		this.effectValue = bank.Balance + effect;
		
		return bank.Balance + effect;
	}
	
	public String toString(){
		
		
		
		
		return "\n" + "Effect: " + effect + "\n" +
			    "Name: " + Name + "\n" + 
				"Details: " + Details + "\n";
	}
}
	