package dessin_vectoriel;

//BM : peut etre une forme, une droite, un trait courbe etc
public abstract class Element implements IElement{

	private boolean visibilite;
	private Couleur couleur;
	private int epaisseur;
	
	
	public Element(boolean visibilite, Couleur couleur,int epaisseur) {
		super();
		this.visibilite = visibilite;
		this.couleur = couleur;
		this.epaisseur = epaisseur;
	}
	public boolean isVisibilite() {
		return visibilite;
	}
	public void setVisibilite(boolean visibilite) {
		this.visibilite = visibilite;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public int getEpaisseur() {
		return epaisseur;
	}
	
	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}
}
