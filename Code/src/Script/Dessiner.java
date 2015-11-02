package script;

import java.util.List;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Image;

/**
 * Instruction terminale representant l'instruction dessiner() 
 *
 */
public class Dessiner extends InstructionTerminale{
	private List<Element> elements;
	private Couleur couleur;
	

	public Dessiner(List<Element> elements, Couleur couleur) {
		super();
		this.elements = elements;
		this.couleur = couleur;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	@Override
	public Image executer(Image image) {
		image.addAll(this.getElements());
		return image;
	}


	
	

}
