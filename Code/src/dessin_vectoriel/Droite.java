package dessin_vectoriel;

import traducteurs.Traducteur;

public class Droite extends Element implements IElement{
	
	private Vecteur vecteur;
	
	public Droite(boolean visibilite, Couleur couleur, int epaisseur, Vecteur vecteur) {
		super(visibilite, couleur, epaisseur);
		this.vecteur = vecteur;
	}

	
	public Vecteur getVecteur() {
		return vecteur;
	}

	public void setVecteur(Vecteur vecteur) {
		this.vecteur = vecteur;
	}
	
	public String toString() {
		return "Droite(" + vecteur + ")";
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerDroite
	public static Droite creer(boolean visibilite, Couleur couleur, int epaisseur, Vecteur d){
		return new Droite(visibilite, couleur, epaisseur, d);
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerDroite
	public Droite creer(boolean visibilite, Couleur couleur,int epaisseur, Point p1, Point p2){
		return new Droite(visibilite, couleur, epaisseur, new Vecteur(p1,p2));
	}

	//BM : peut etre a creer dans Element et dans ce cas a appeler creerDroite
	public Droite creer(boolean visibilite, Couleur couleur,int epaisseur, int x1, int y1, int x2, int y2){
		return new Droite(visibilite, couleur, epaisseur, new Vecteur(Point.creer(x1,y1),Point.creer(x2,y2)));
	}
	
	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}
	
}
