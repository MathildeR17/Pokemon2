package histoire;

import pokemons.Pokemon;

public class Histoire {

	public static void main(String[] args) {
		System.out. println ("\nTEST POKEMON \n"); 
		Pokemon p1 = new Pokemon("Rhinolove"); 
		Pokemon p2 = new Pokemon("Chovsourir"); 
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString() );
	}

}
