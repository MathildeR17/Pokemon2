package pokemons.types;

import pokemons.Pokemon;
import pokemons.TypePokemon;

public class PokemonEau extends Pokemon{

	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}
	
	public void attaquer(Pokemon p) {
		
		log("J'attaque " + p.getNom() + " : " + this.getType() + " VS " + p.getType());
		p.subir(this);
	}
	
	public void subir(Pokemon p) {
		if(p.getType() == TypePokemon.PLANTE) {
			this.setHp(this.getHp() - 2*(p.getAtk()));
			log("C'est très efficace!");
		}else {
			this.setHp(this.getHp() - (1/2)*(p.getAtk()));
			log("C'est peu efficace...");
		}
	}

}
