package dessin_vectoriel;

import java.util.List;

import traducteurs.Traducteur;

public class BezierOld extends Element{
	
	private List<Point> points;

	public BezierOld(boolean visibilite, Couleur couleur, int epaisseur, List<Point> points) {
		super(visibilite, couleur, epaisseur);
		// TODO Auto-generated constructor stub
		this.points=points;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public static BezierOld creer(boolean visibilite, Couleur couleur, int epaisseur, List<Point> points){
		return new BezierOld(visibilite, couleur, epaisseur, points);
	}

	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}
	

}
