package builders;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import script.Script;

public abstract class ElementBuilder extends ScriptBuilder{

	Couleur couleur;
	int epaisseur;
	boolean visibilite;
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}

	public void setVisibilite(boolean visibilite) {
		this.visibilite = visibilite;
	}
	
	public abstract Element getElement();
	
	
}
