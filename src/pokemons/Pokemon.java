package pokemons;

import java.util.Random;

public abstract class Pokemon {
	//ATTRIBUTS
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	private Random r = new Random();
	static int nMax = 10;
	
	//CONSTRUCTEUR
	public Pokemon(String nom) {
		this.nom = nom;
		this.niveau = r.nextInt(nMax+1);
		this.hp = 2*this.niveau;
		this.atk = (this.niveau/2)+1;
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
				" mon attaque de base et de " + getAtk());
	}
	
	private String prefixe () {
        return "[Pokemon " + this.nom + "] : ";
    }
	
	public void log(String msg) {
		 System.out.println (prefixe()+msg);
	}
	
	
	
	
}
