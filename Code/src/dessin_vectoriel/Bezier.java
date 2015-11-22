package dessin_vectoriel;

import traducteurs.Traducteur;

public class Bezier extends Element {
	Point depart;
	Point arrivee;
	Point controle;

	public Bezier(boolean visibilite, Couleur couleur, int epaisseur, Point depart, Point arrivee, Point controle) {
		super(visibilite, couleur, epaisseur);
		this.depart = depart;
		this.arrivee = arrivee;
		this.controle = controle;
	}
	
	public Point getDepart() {
		return depart;
	}


	public Point getArrivee() {
		return arrivee;
	}


	public Point getControle() {
		return controle;
	}

	@Override
	public void traduire(Traducteur traducteur) {
		traducteur.traduire(this);
	}

}
