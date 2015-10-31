package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;
import script.Dessiner;
import script.Script;

public class CercleBuilder extends ScriptBuilder {
	private Point centre;
	private int rayon;
	private Couleur couleur;
	
	public CercleBuilder() {
	}
	
	public CercleBuilder centre(int x, int y) {
		this.centre = new Point(x, y);
		return this;
	}
	
	public CercleBuilder rayon(int rayon) {
		this.rayon = rayon;
		return this;
	}
	
	public CercleBuilder couleur (int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}

	public Script script() {
		Cercle cercle = new Cercle(false, true, couleur, 1, centre, rayon);
		List<Element> list = new ArrayList<Element>();
		list.add(cercle);
		return new Dessiner(list, couleur);
	}
}
