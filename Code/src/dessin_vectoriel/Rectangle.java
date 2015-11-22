package dessin_vectoriel;

import traducteurs.Traducteur;


//BM : le triangle est pour le moment parallele aux axes du rectangle definissant le cadre du dessin
public class Rectangle extends Forme implements IForme {
	
	private int largeur;
	private int hauteur;
	
	public Rectangle(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre,
			int largeur, int hauteur) {
		super(remplissage, visibilite, couleur, epaisseur, barycentre);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}


	//BM : peut etre a creer dans Element et dans ce cas a appeler creerRectangle
	public static Rectangle creer(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre,
				int largeur, int hauteur){
			return new Rectangle(remplissage, visibilite, couleur, epaisseur, barycentre, largeur, hauteur);
	}

	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}

}
