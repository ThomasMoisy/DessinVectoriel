package dessin_vectoriel;

/*
 * Represente une forme geometrique quelconque (carre, rond, triangle, etc)
 */
public abstract class Forme extends Element implements IForme {
	
	private boolean remplissage;
	private Point barycentre;//BM : sert de position a la figure
	
	
	
	public Forme(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre) {
		super(visibilite, couleur, epaisseur);
		this.remplissage = remplissage;
		this.barycentre = barycentre;
	}
	
	
	public boolean isRemplissage() {
		return remplissage;
	}
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}
	
	public Point getBarycentre() {
		return barycentre;
	}
	public void setBarycentre(Point barycentre) {
		this.barycentre = barycentre;
	}
	

}
