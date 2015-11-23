package script;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Orientation;
import dessin_vectoriel.Point;


/* BM : 
 * Cette instruction permet d'associer a un element a une etiquette
 * Peut eventuellement etre modifier si on construit l etiquette dans l instruction mais dans ce cas il faut beaucoup de parametres en entree (visibilite, etc)
 */
public class Etiqueter  extends InstructionTerminale  {

	private Element element;
	private Etiquette etiquette;
	
	
	public Etiqueter(Element element, Couleur couleur, int epaisseur, String texte,
			Orientation orientation, Point position) {
		super();
		this.element = element;
		this.etiquette = Etiquette.creer(true, couleur, epaisseur, texte, element, orientation,position);
	}
	
	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public Etiquette getEtiquette() {
		return etiquette;
	}
	
	public void setEtiquette(Etiquette etiquette) {
		this.etiquette = etiquette;
	}
	
	public static Etiqueter creer(Element element, Couleur couleur, int epaisseur, String texte,
			Orientation orientation, Point position) {
		return new Etiqueter(element, couleur, epaisseur, texte, orientation, position);
	}

	@Override
	public Image executer(Image image) {
		image.add(this.getEtiquette());
		return image;
	}

}
