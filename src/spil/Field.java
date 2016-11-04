package spil;


public class Field {
	//Define variables:
	int effect;
	int effectValue;
	private String Details;
	private String Name;
	private boolean extraTurn; 

	public Field(){ //create constructor
		
	}
	
	public Field(int effect, String Name, String Details, boolean extraTurn) {
		this.effect = effect;
		this.Name = Name;
		this.Details = Details;
	}

	public int getEffectValue() {
		return (this.effect);
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
	
	
	public String toString(){
		
		return "\n" + "Name: " + Name + "\n" + 
				"Effect on bank: " + effect + "\n" +
				"Details: " + Details + "\n";

	}
	
}

	
	