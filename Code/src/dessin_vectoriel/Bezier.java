package dessin_vectoriel;

import java.util.List;

public class Bezier extends Element implements IElement{
	
	private List<Point> points;

	public Bezier(boolean visibilite, Couleur couleur, int epaisseur, List<Point> points) {
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
	
	public static Bezier creer(boolean visibilite, Couleur couleur, int epaisseur, List<Point> points){
		return new Bezier(visibilite, couleur, epaisseur, points);
	}
	

}
