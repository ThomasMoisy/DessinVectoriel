package builders;

import java.util.ArrayList;
import java.util.List;
import dessin_vectoriel.Rectangle;
import dessin_vectoriel.Element;
import dessin_vectoriel.Forme;
import script.Dessiner;
import script.Script;

public class RectangleBuilder extends FormeBuilder {

	private int longueur;
	private int hauteur;
	
	public RectangleBuilder() {}
	
	public RectangleBuilder longueur(int longueur) {
		this.longueur=longueur;
		return this;
	}
	
	public RectangleBuilder hauteur(int hauteur) {
		this.hauteur=hauteur;
		return this;
	}
	
	
	@Override
	public Forme getElement() {
		return Rectangle.creer(remplissage, visibilite, couleur, 1, barycentre, hauteur, longueur);
	}

	@Override
	public Script script() throws Exception {
		//cree un carre avec les bons parametres
		Rectangle rectangle = Rectangle.creer(remplissage, true, couleur, 1, barycentre, hauteur, longueur);
		//ajoute ce cercle a une liste
		List<Element> list = new ArrayList<Element>();
		list.add(rectangle);
		//retourne l'instruction Dessiner
		return new Dessiner(list);
	}
}
