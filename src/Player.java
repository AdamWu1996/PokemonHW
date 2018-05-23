
public class Player {
	
	private String playerName;
	Pokemon[] pokemons;
	int level;
	
	Player(String playerName) {
		this.playerName = playerName;
		level = 1;
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public Pokemon[] getPokemons() {
		return this.pokemons;
	}
	
	public PokemonType getValueByPokemonTypeArray(int index) {
		return pokemons[index].getType();
	}
	
	public void setPokemons(Pokemon[] pokemon) {
		this.pokemons = new Pokemon[pokemon.length];
		for(int i = 0 ; i < pokemon.length; i++) {
			Pokemon tmp = new Pokemon(pokemon[i].getName(), pokemon[i].getType(), pokemon[i].getCp());
			this.pokemons[i] = tmp;
		}
	}
	
	public int getLevel() {
		return this.level;
	}
	
}
