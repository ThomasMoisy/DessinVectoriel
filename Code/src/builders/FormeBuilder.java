package builders;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Forme;

public abstract class FormeBuilder extends ScriptBuilder{
	boolean remplissage = false;
	Couleur couleur;
	
	abstract public Forme getForme();
	
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
}
