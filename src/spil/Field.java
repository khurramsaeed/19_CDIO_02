package spil;


public class Field {
	//Define variables:
	private int effect;
	private String Details;
	private String Name;
	
	//Field constructor is created with and integer and two strings
	public Field(int effect, String Name, String Details) {
		this.effect = effect;
		this.Name = Name;
		this.Details = Details;
	}


	//This methods shows which field the player lands on and adds the effect to the Balance
	public void landOn(Player p){
		p.getBank().addEffect(effect);
		Language.landedOn(Name, Details, effect, p.getBank());
	
	}
}

	
	