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

	public boolean extraTurn() {
		
		return true;
	}
	
	public void landOn(Player p){
		p.getBank().addEffect(effect);
		System.out.println(Name);
		System.out.println(Details);
		System.out.println(effect);
		System.out.println(p.bank.Balance);
	}
	
	
	public String toString(){
		
		return "\n" + "Name: " + Name + "\n" + 
				"Details: " + Details + "\n" +
				"Effect on bank: " + effect + "\n";

	}
	
}

	
	