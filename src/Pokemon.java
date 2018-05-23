

public class Pokemon {
	
	private static String name;
	private PokemonType type;
	private int cp;
	
	Pokemon(String name, PokemonType type ,int cp) {
		Pokemon.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public String getName() {
		return Pokemon.name;
	}
	
	public PokemonType getType() {
		return this.type;
	}
	
	public int getCp() {
		return this.cp;
	}
	
	public void setCp(int cp) {
		this.cp = cp;
	}

}
