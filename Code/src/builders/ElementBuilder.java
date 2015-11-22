package builders;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;

public abstract class ElementBuilder extends ScriptBuilder{

	Couleur couleur;
	int epaisseur;
	boolean visibilite;
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}

	public void setVisibilite(boolean visibilite) {
		this.visibilite = visibilite;
	}
	
	public ElementBuilder couleur(Couleur couleur){
		this.couleur=couleur;
		return this;
	}
	
	public ElementBuilder epaisseur(int epaisseur){
		this.epaisseur=epaisseur;
		return this;
	}
	
	public ElementBuilder visibilite(boolean visibilite){
		this.visibilite=visibilite;
		return this;
	}
	
	public abstract Element getElement();
	
	
}
