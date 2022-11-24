package dresseurs;

import dresseurs.materiels.PokeBall;
import dresseurs.materiels.SacADos;

public class Dresseur {
	private SacADos sacADos;
	private PokeBall pokeBall;
	private String nom;
	private int argent;
	
	public Dresseur(String nom, int argent) {
		this.nom = nom;
		this.argent = argent;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public SacADos getSacADos() {
		return this.sacADos;
	}
	
	public String toString() {
		return ("Je m'appelle " + getNom() + 
				"\n j'ai " + getSacADos() + " Pokemons! \n " +
				"je possède " + getArgent() + " $");
	}
}
