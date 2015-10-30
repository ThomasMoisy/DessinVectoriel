package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Droite;
import dessin_vectoriel.IElement;
import dessin_vectoriel.Point;
import dessin_vectoriel.Vecteur;
import script.Dessiner;
import script.Script;

public class PointsBuilder extends ScriptBuilder {
	private List<Point> points = new ArrayList<Point>();
	private Couleur couleur;
	
	public PointsBuilder() {
	}
	
	public PointsBuilder point(int x, int y) {
		points.add(new Point(x, y));
		return this;
	}
	
	
	public PointsBuilder couleur(int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}
	
	public Script script() {
		List<IElement> list = new ArrayList<IElement>();
		for (int i = 0; i < points.size()-1; i++) {
			Vecteur v = new Vecteur(points.get(i), points.get(i+1));
			Droite d = new Droite(true, couleur, 1, v);
			list.add(d);
		}
		return new Dessiner(list, couleur);
	}

}
