package pokemons;

import java.util.Random;

public abstract class Pokemon {
	//ATTRIBUTS
	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	protected TypePokemon type;
	static int nMax = 10;
	private Random r = new Random();
	
	//CONSTRUCTEUR
	public Pokemon(String nom, TypePokemon type) {
		this.nom = nom;
		this.niveau = r.nextInt(nMax+1);
		this.hp = 2*this.niveau;
		this.atk = (this.niveau/2)+1;
		this.type = type;
	}

	//GETTERS AND SETTERS  
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * @param atk the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	/**
	 * @return the type
	 */
	public TypePokemon getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypePokemon type) {
		this.type = type;
	}

	//MÉTHODES 
	public boolean isKO() {
		return this.hp == 0;
	}
	
	public void soigner() {
		this.hp = 2*this.niveau;
	}
	
	public abstract void attaquer (Pokemon p);
	
	public abstract void subir(Pokemon p);
	
	public String toString() {
		return ("Je m'appelle " + getNom() + 
				" !\n je suis de niveau " + getNiveau() +
				"\n j'ai " + getHp() + " points de vie\n" +
				" mon attaque de base et de " + getAtk() + 
				" je suis de type " + getType());
	}
	
	private String prefixe () {
        return "[Pokemon " + this.nom + "] : ";
    }
	
	public void log(String msg) {
		 System.out.println (prefixe()+msg);
	}
	
	
	
	
}
