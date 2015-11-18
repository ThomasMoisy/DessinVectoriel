package dessin_vectoriel;

import traducteurs.Traducteur;

public class Carre extends Forme implements IForme{
	
	//BM : Une maniere de representer un carre a partir de son centre en prenant un vecteur d'une diagonal, les autres se trouvent ensuite facilement
	private Vecteur diagonale;
	
	
	public Carre(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre,
			Vecteur diagonale) {
		super(remplissage, visibilite, couleur, epaisseur, barycentre);
		this.diagonale = diagonale;
	}
	
	public Vecteur getDiagonale() {
		return diagonale;
	}
	
	public void setDiagonale(Vecteur diagonale) {
		this.diagonale = diagonale;
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerCarre
	public static Carre creer(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, 
		Point p1, Point p2, Point p3, Point p4){
		//BM : calcul du barycentre
		int xG =(p1.getX()+p2.getX()+p3.getX()+p4.getX())/4;
		int yG =(p1.getY()+p2.getY()+p3.getY()+p4.getY())/4;
		Point G = Point.creer(xG, yG);
		Vecteur diagonale = new Vecteur(G,p1);
		return new Carre(remplissage,visibilite,couleur,epaisseur, G ,diagonale);
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerCarre
	public static Carre creer(boolean remplissage, boolean visibilite, Couleur couleur,int epaisseur, Point barycentre,
			Vecteur diagonale){
		return new Carre(remplissage,visibilite,couleur, epaisseur, barycentre,diagonale);
	}
	
	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}
	
}
