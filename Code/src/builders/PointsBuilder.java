package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;
import dessin_vectoriel.Vecteur;
import script.Dessiner;
import script.Script;

/**
 * 
 * Builder pour creer l'instruction dessiner(listeDePoints)
 * ex dessiner((0,0)--(1,0))
 *
 */
public class PointsBuilder extends ScriptBuilder {
	private List<Point> points = new ArrayList<Point>();
	private Couleur couleur;
	
	public PointsBuilder() {
	}
	
	/**
	 * ajoute un point a la liste
	 * @param x
	 * @param y
	 * @return un PointsBuilder
	 */
	public PointsBuilder point(int x, int y) {
		points.add(new Point(x, y));
		return this;
	}
	
	/**
	 * regle la couleur des points
	 * @param couleur
	 * @return un PointsBuilder
	 */
	public PointsBuilder couleur(int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}
	
	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return
	 */
	public Script script() {
		List<Element> list = new ArrayList<Element>();
		//cree de droites a reliant les points i et i+1
		for (int i = 0; i < points.size()-1; i++) {
			Vecteur v = new Vecteur(points.get(i), points.get(i+1));
			Droite d = new Droite(true, couleur, 1, v);
			//ajoute les droites a une liste
			list.add(d);
		}
		//cree l'instruction dessiner
		return new Dessiner(list, couleur);
	}

}
