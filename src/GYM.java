public class GYM {
	
	public static Player fight(Player p1,Player p2) {
		
		System.out.println(p1.getValueByPokemonTypeArray(0));
		return p2;
	}
	

	public static int getValueByType(PokemonType type) {
		
		switch (type) {
		case FIRE:
			return 1;

		case GRASS:
			return 2;
			
		case WATER:
			return 3;
		}
		
		return 0;
	}
	
	public int judgement(int p1,int p2) {
		int p1Win = 1,
			p2Win = 2,
			draw  = 3;
		
		int fire  = 1,
			grass = 2,
			water = 3;
		
		int error = 0;
		
		if(p1==fire) {
			if(p2==fire)
				return draw;
			if(p2==grass)
				return p1Win;
			if(p2==water)
				return p2Win;
		}
		
		if(p1==grass) {
			if(p2==fire)
				return p2Win;
			if(p2==grass)
				return draw;
			if(p2==water)
				return p1Win;
		}
		
		if(p1==water) {
			if(p2==fire)
				return p1Win;
			if(p2==grass)
				return p2Win;
			if(p2==water)
				return draw;
		}
		return error;
		
	}
}
