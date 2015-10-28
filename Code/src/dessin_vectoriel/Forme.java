package dessin_vectoriel;

/*
 * Represente une forme geometrique quelconque (carre, rond, triangle, etc)
 */
public class Forme implements IForme {
	
	private boolean remplissage;
	private boolean visibilite;
	private Couleur couleur;
	private Point barycentre;
	
	public boolean isRemplissage() {
		return remplissage;
	}
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
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
	public Point getBarycentre() {
		return barycentre;
	}
	public void setBarycentre(Point barycentre) {
		this.barycentre = barycentre;
	}
	

}
