package dessin_vectoriel;

import java.util.List;

import traducteurs.Traducteur;

public class Chemin extends Element{
	Point depart;
	List<Point> points;
	
	public Chemin(boolean visibilite, Couleur couleur, int epaisseur, Point depart, List<Point> points) {
		super(visibilite, couleur, epaisseur);
		this.depart = depart;
		this.points = points;
	}
	
	
	public Point getDepart() {
		return depart;
	}
	
	public List<Point> getPoints() {
		return points;
	}

	@Override
	public void traduire(Traducteur traducteur) {
		traducteur.traduire(this);
	}
	
	
}
