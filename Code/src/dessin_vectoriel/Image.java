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

	public Image(Image i) {
		this.elements = i.getElements();
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
	
	public void addAll(List<Element> elements) {
		this.elements.addAll(elements);
	}
	
	
}
