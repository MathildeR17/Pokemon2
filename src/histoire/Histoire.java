package histoire;

import pokemons.Pokemon;
import pokemons.TypePokemon;
import pokemons.types.PokemonEau;
import pokemons.types.PokemonFeu;

public class Histoire {

	public static void main(String[] args) {
		System.out. println ("\nTEST POKEMON \n"); 
		PokemonEau eau = new PokemonEau("PokéEau"); 
		PokemonFeu feu = new PokemonFeu("PokéFeu"); 
		eau.log(eau.toString());
		feu.log(feu.toString());
		eau.attaquer(feu);
		feu.attaquer(eau);
		eau.log(eau.toString());
		feu.log(feu.toString() );
	}
	

}
