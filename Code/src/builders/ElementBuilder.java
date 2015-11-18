package builders;

import dessin_vectoriel.Couleur;
import script.Script;

public abstract class ElementBuilder extends ScriptBuilder{

	Couleur couleur;
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

}
