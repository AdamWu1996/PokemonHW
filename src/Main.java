

public class Main {

	public static void main(String[] args) {
		GYM a = new GYM();
		Player a1 = new Player("abc");
		Player a2 = new Player("abc1");
		Pokemon[] pk2 = new Pokemon[] { {"pok1",PokemonType.FIRE,100},{"pok1",PokemonType.FIRE,100}};
		a.fight(a1, a2);
		//System.out.println(PokemonType.FIRE);
	}

}
