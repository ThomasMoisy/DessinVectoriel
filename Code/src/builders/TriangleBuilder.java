package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.IElement;
import dessin_vectoriel.Point;
import dessin_vectoriel.Triangle;
import script.Dessiner;
import script.Script;

public class TriangleBuilder {
	private Point p1;
	private Point p2;
	private Point p3;
	private Couleur couleur;
	
	public TriangleBuilder point1(int x, int y) {
		this.p1 = new Point(x, y);
		return this;
	}
	
	public TriangleBuilder point2(int x, int y) {
		this.p2 = new Point(x, y);
		return this;
	}
	
	public TriangleBuilder point3(int x, int y) {
		this.p3 = new Point(x, y);
		return this;
	}
	
	public TriangleBuilder couleur (int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}

	public Script script() {
		Triangle triangle = new Triangle(false, true, couleur, 1, p1, p2, p3);
		List<IElement> list = new ArrayList<IElement>();
		list.add(triangle);
		return new Dessiner(list, couleur);
	}
	
}
