package builders;

import java.util.ArrayList;
import java.util.List;

import script.Dessiner;
import script.Script;
import dessin_vectoriel.Chemin;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;

/**
 * CheminBuilder qui contient des methodes pour construire les  
 * parametres d'une instruction dessiner(chemin)
 */
public class CheminBuilder extends FormeBuilder{
	Point depart;
	List<Point> points = new ArrayList<Point>();
	
	@Override
	public Element getElement() {
		return Chemin.creer(true, couleur, epaisseur, depart, points);
	}
	
	/**
	 * regle le point de depart de la courbe
	 * @param x l'abscisse
	 * @param y l'ordonnee
	 * @return le CheminBuilder this
	 */
	public CheminBuilder depart(int x, int y) {
		depart = Point.creer(x, y);
		return this;
	}
	
	/**
	 * ajoute un couple (point_de_controle, point d'arrivee) au chemin this
	 * @param x1 l'abscisse du point de controle
	 * @param y1 l'ordonee du point de controle
	 * @param x2 l'abscisse du point d'arrivee
	 * @param y2 l'ordonee du point d'arrivee
	 * @return
	 */
	public CheminBuilder add(int x1, int y1, int x2, int y2) {
		points.add(Point.creer(x1, y1));
		points.add(Point.creer(x2, y2));
		return this;
	}
	
	/**
	 * regle la couleur de la courbe
	 * @param couleur
	 * @return le CheminBuilder this
	 */
	public CheminBuilder couleur(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}

	@Override
	public Script script() throws Exception {
		//cree un chemin avec les bons parametres
		Chemin chemin = Chemin.creer(true, couleur, epaisseur, depart, points);
		//ajoute ce chemin a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(chemin);
		//retourne l'instruction Dessiner
		return new Dessiner(list);

	}

}
