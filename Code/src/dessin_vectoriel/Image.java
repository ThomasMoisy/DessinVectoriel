package dessin_vectoriel;

import java.util.ArrayList;
import java.util.List;

public class Image implements IImage {

	private List<Element> elements = new ArrayList<Element>();
	
	public Image() {
	}

	public Image(List<Element> elements) {
		super();
		this.elements = elements;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
	
	public void add(Element e) {
		elements.add(e);
	}
	
	
}
