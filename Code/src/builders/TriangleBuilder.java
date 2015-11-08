package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;
import dessin_vectoriel.Triangle;
import script.Dessiner;
import script.Script;

/**
 * TriangleBuilder qui contient des methodes pour construire les  
 * parametres d'une instruction dessiner(triangle)
 */
public class TriangleBuilder extends ScriptBuilder {
	private Point p1;
	private Point p2;
	private Point p3;
	private Couleur couleur;
	
	/**
	 * regle le premier point composant le triangle
	 * @param x
	 * @param y
	 * @return un TriangleBuilder
	 * @throws Exception 
	 */
	public TriangleBuilder point1(Object x, Object y) throws Exception {
		//this.p1 = new Point(false, couleur, 1, x, y);
		this.p1 = new PointBuilder(x, y, couleur).execute();
		return this;
	}
	
	/**
	 * regle le deuxieme point composant le triangle
	 * @param x
	 * @param y
	 * @return un TriangleBuilder
	 * @throws Exception 
	 */
	public TriangleBuilder point2(Object x, Object y) throws Exception {
		//this.p2 = new Point(false, couleur, 1, x, y);
		this.p2 = new PointBuilder(x, y, couleur).execute();
		return this;
	}
	
	/**
	 * regle le troisieme point composant le triangle
	 * @param x
	 * @param y
	 * @return un TriangleBuilder
	 * @throws Exception 
	 */
	public TriangleBuilder point3(Object x, Object y) throws Exception {
		//this.p3 = new Point(false, couleur, 1, x, y);
		this.p3 = new PointBuilder(x, y, couleur).execute();
		return this;
	}
	
	/**
	 * regle la couleur du cercle
	 * @param couleur, la couleur du triangle
	 * @return un TriangleBuilder
	 */
	public TriangleBuilder couleur (int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}

	/**
	 * regle la couleur du cercle
	 * @param couleur, la couleur du cercle
	 * @return un CercleBuilder
	 */
	public Script script() {
		//cree un triangle avec les bons parametres
		Triangle triangle = new Triangle(false, true, couleur, 1, p1, p2, p3);
		List<Element> list = new ArrayList<Element>();
		//ajoute ce triangle a une liste
		list.add(triangle);
		//retourne l'instruction Dessiner
		return new Dessiner(list, couleur);
	}
	
}
