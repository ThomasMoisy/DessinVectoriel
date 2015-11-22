package dessin_vectoriel;

import traducteurs.Traducteur;


//BM : le triangle est pour le moment parallele aux axes du rectangle definissant le cadre du dessin
public class Rectangle extends Forme implements IForme {
	
	private int largeur;
	private int longueur;
	
	public Rectangle(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre,
			int largeur, int longueur) {
		super(remplissage, visibilite, couleur, epaisseur, barycentre);
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}


	//BM : peut etre a creer dans Element et dans ce cas a appeler creerRectangle
	public static Rectangle creer(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre,
				int largeur, int longueur){
			return new Rectangle(remplissage, visibilite, couleur, epaisseur, barycentre, largeur, longueur);
	}

	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}

}
