package script;

import dessin_vectoriel.Image;

/**
 * 
 * Classe representant l'instruction d'affectation de valeur a une variable
 * Pas encore implementee entierement
 */
public class AffectationVariable extends InstructionTerminale {
	String identifiant;
	float valeur;
	
	public AffectationVariable(String identifiant, float valeur) {
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

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}


	@Override
	public Image executer(Image image) {
		// TODO Auto-generated method stub
		return null;
	}

}
