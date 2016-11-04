package spil;


public class Field {
	//Define variables:
	private int effect;
	private String Details;
	private String Name;
	

	public Field(int effect, String Name, String Details) {
		this.effect = effect;
		this.Name = Name;
		this.Details = Details;
	}


	
	public void landOn(Player p){
		p.getBank().addEffect(effect);
		Language.landedOn(Name, Details, effect, p.getBank());
	
	}
}

	
	