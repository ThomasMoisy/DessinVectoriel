package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Point;
import script.Dessiner;
import script.Script;

/**
 * CercleBuilder qui contient des methodes pour construire les  
 * parametres d'une instruction dessiner(cercle)
 */
public class CercleBuilder extends ScriptBuilder {
	private Point centre;
	private int rayon;
	private Couleur couleur;
	
	public CercleBuilder() {
	}
	
	/**
	 * regle le centre du cercle
	 * @param x abscisse du cercle
	 * @param y ordonnee du cercle
	 * @return un CercleBuilder
	 * @throws Exception 
	 */
	public CercleBuilder centre(int x, int y) throws Exception {
		//this.centre = new Point(false, couleur, 1, x, y);
		this.centre = new PointBuilder(x, y, couleur).execute();
		return this;
	}
	
	/**
	 * regle le rayon du cercle 
	 * @param rayon, le rayon du cercle
	 * @return un CerlceBuilder
	 */
	public CercleBuilder rayon(int rayon) {
		this.rayon = rayon;
		return this;
	}
	
	/**
	 * regle la couleur du cercle
	 * @param couleur, la couleur du cercle
	 * @return un CercleBuilder
	 */
	public CercleBuilder couleur (int couleur) {
		this.couleur = new Couleur(couleur);
		return this;
	}

	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return un Script
	 */
	public Script script() {
		//cree un cercle avec les bons parametres
		Cercle cercle = new Cercle(false, true, couleur, 1, centre, rayon);
		//ajoute ce cercle a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(cercle);
		//retourne l'instruction Dessiner
		return new Dessiner(list, couleur);
	}
}
