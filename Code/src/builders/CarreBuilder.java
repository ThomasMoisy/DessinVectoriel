package builders;

import java.util.ArrayList;
import java.util.List;

import script.Dessiner;
import script.Script;
import dessin_vectoriel.Carre;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Forme;
import dessin_vectoriel.Point;

public class CarreBuilder extends FormeBuilder {
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	Couleur couleur;
	
	public CarreBuilder() {}
	
	public CarreBuilder diagonale(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		p1 = new Point(true, Couleur.BLACK, 1, x1, y1);
		p2 = new Point(true, Couleur.BLACK, 1, x2, y2);
		p3 = new Point(true, Couleur.BLACK, 1, x3, y3);
		p4 = new Point(true, Couleur.BLACK, 1, x4, y4);
		return this;
	}
	
	public CarreBuilder couleur(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}
	
	@Override
	public Forme getElement() {
		return Carre.creer(false, true, couleur, 1, p1, p2, p3, p4);
	}

	@Override
	public Script script() throws Exception {
		//cree un carre avec les bons parametres
		Carre carre = Carre.creer(false, true, couleur, 1, p1, p2, p3, p4);
		//ajoute ce cercle a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(carre);
		//retourne l'instruction Dessiner
		return new Dessiner(list);
	}

}
