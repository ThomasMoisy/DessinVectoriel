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
public class ListePointsBuilder extends ScriptBuilder {
	private List<PointBuilder> points = new ArrayList<PointBuilder>();
	private Couleur couleur;
	
	public ListePointsBuilder() {
	}
	
	/**
	 * ajoute un point a la liste
	 * @param x
	 * @param y
	 * @return un PointsBuilder
	 */
	public ListePointsBuilder point(Object x, Object y) {
		points.add(new PointBuilder(x, y, couleur));
		return this;
	}
	
	/**
	 * regle la couleur des points
	 * @param couleur
	 * @return un PointsBuilder
	 */
	public ListePointsBuilder couleur(Couleur couleur) {
		this.couleur = couleur;
		return this;
	}
	
	
	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return
	 * @throws Exception 
	 */
	public Script script() throws Exception {
		List<Element> list = new ArrayList<Element>();
		//cree de droites a reliant les points i et i+1
		for (int i = 0; i < points.size()-1; i++) {
			Point p = points.get(i).execute();
			Point pp = points.get(i+1).execute();
			Vecteur v = Vecteur.creer(p, pp);
			Droite d = Droite.creer(true, couleur, 1, v);
			//ajoute les droites a une liste
			list.add(d);
		}
		//cree l'instruction dessiner
		return new Dessiner(list);
	}

}
