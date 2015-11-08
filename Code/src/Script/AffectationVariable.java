package script;

import dessin_vectoriel.Image;

/**
 * 
 * Classe representant l'instruction d'affectation de valeur a une variable
 * Pas encore implementee entierement
 */
public class AffectationVariable extends InstructionTerminale {
	String identifiant;
	int valeur;
	
	public AffectationVariable(String identifiant, int valeur) {
		super();
		this.identifiant = identifiant;
		this.valeur = valeur;
	}
		
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public AffectationVariable execute() {
		Contexte.contexte.bind(identifiant, valeur);
		return this;
	}


	@Override
	public Image executer(Image image) {
		return image;
	}

}
