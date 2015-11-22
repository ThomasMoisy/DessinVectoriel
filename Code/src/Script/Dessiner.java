package script;

import java.util.List;

import dessin_vectoriel.Element;
import dessin_vectoriel.Image;

/**
 * Instruction terminale representant l'instruction dessiner() 
 *
 */
public class Dessiner extends InstructionTerminale{
	private List<Element> elements;
	

	public Dessiner(List<Element> elements) {
		super();
		this.elements = elements;
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

	public String toString() {
		return elements.toString();
	}
	
	

}
