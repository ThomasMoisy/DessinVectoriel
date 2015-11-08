package script;

import java.util.List;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Image;

/*
 * Comme on insère un dessin, le choix a été fait d'étendre
 *  "dessiner" pour "insérer", en précisant le dessin "support",
 *  désigné par la liste d'éléments elementsSupport
 */

public class Inserer extends Dessiner {
	private List<Element> elementsSupport;
	

	public Inserer(List<Element> elements, Couleur couleur, List<Element> elementsSupport) {
		super(elements, couleur);
		this.elementsSupport = elementsSupport;
	}
	
	public List<Element> getElementsSupport() {
		return elementsSupport;
	}

	public void setElementsSupport(List<Element> elementsSupport) {
		this.elementsSupport = elementsSupport;
	}

	@Override
	public Image executer(Image image) {
		image.addAll(this.getElements());
		return image;
	}

}
