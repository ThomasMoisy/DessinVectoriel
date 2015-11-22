package builders;

import java.util.ArrayList;
import java.util.List;

import script.Dessiner;
import script.Script;
import dessin_vectoriel.Chemin;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Forme;
import dessin_vectoriel.Point;

public class CheminBuilder extends FormeBuilder{
	Point depart;
	List<Point> points = new ArrayList<Point>();
	
	@Override
	public Forme getElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public CheminBuilder depart(int x, int y) {
		depart = new Point(x, y);
		return this;
	}
	
	public CheminBuilder add(int x1, int y1, int x2, int y2) {
		points.add(new Point(x1, y1));
		points.add(new Point(x2, y2));
		return this;
	}
	
	public CheminBuilder couleur(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}

	@Override
	public Script script() throws Exception {
		//cree un chemin avec les bons parametres
		Chemin chemin = new Chemin(true, couleur, epaisseur, depart, points);
		//ajoute ce chemin a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(chemin);
		//retourne l'instruction Dessiner
		return new Dessiner(list);

	}

}
