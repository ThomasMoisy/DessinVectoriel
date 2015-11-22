package builders;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Forme;

public abstract class FormeBuilder extends ElementBuilder{
	
	boolean remplissage = false;
	
	
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}
	
}
