package traducteurs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import dessin_vectoriel.Bezier;
import dessin_vectoriel.Carre;
import dessin_vectoriel.Cercle;
import dessin_vectoriel.Chemin;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Point;
import dessin_vectoriel.Triangle;

public class TraducteurSVG implements Traducteur{

	private Document doc;
	private Element svg;
	
	
	public TraducteurSVG() throws ParserConfigurationException {
		super();
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument(); 
		this.doc = doc;
		this.initialize(doc);
	}

	public void initialize(Document doc) {
		this.svg = doc.createElement("svg");
		Attr xmlns = doc.createAttribute("xmlns");
		xmlns.setValue("http://www.w3.org/2000/svg");
		Attr version = doc.createAttribute("version");
		version.setValue("1.1");
		Attr width = doc.createAttribute("width");
		width.setValue("600");
		Attr height = doc.createAttribute("height");
		height.setValue("600");
		svg.setAttributeNode(xmlns);
		svg.setAttributeNode(version);
		svg.setAttributeNode(width);
		svg.setAttributeNode(height);
		doc.appendChild(svg);
	}
	
	/*
	 * BM : Traduit les elements composant de l'image un par un
	 */
	@Override
	public void traduire(Image image) {
		// TODO Auto-generated method stub
		System.out.println("Image");
		for (dessin_vectoriel.Element element : image.getElements()) {
			element.traduire(this);
		}
	}

	

	@Override
	public void traduire(Bezier bezier) {
		// TODO Auto-generated method stub
	}

	@Override
	public void traduire(Carre carre) {
		
	}

	@Override
	public void traduire(Cercle cercle) {
		Element circle = doc.createElement("circle");
		Attr cx = doc.createAttribute("cx");
		cx.setValue(cercle.getBarycentre().getX() + "");
		Attr cy = doc.createAttribute("cy");
		cy.setValue(cercle.getBarycentre().getY() + "");
		Attr r = doc.createAttribute("r");
		r.setValue(cercle.getR() + "");
		Attr fill = doc.createAttribute("fill");
		fill.setValue(cercle.getCouleur().getName());
		circle.setAttributeNode(cx);
		circle.setAttributeNode(cy);
		circle.setAttributeNode(r);
		circle.setAttributeNode(fill);
		svg.appendChild(circle);
		//<circle cx="90" cy="80" r="50" fill="blue" />
	}

	@Override
	public void traduire(Chemin chemin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Droite droite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Etiquette etiquette) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Point point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Triangle triangle) {
		//<polygon points="220,10 300,210 170,250 123,234" style="fill:lime;stroke:purple;stroke-width:1" />
		Element polygon = doc.createElement("polygon");
		Attr points = doc.createAttribute("points");
		String string = triangle.getP1().getX() + "," +  triangle.getP1().getY();
		string += " " + triangle.getP2().getX() + "," +  triangle.getP2().getY();
		string += " " + triangle.getP3().getX() + "," +  triangle.getP3().getY();
		points.setValue(string);
		Attr style = doc.createAttribute("style");
		style.setValue("fill:"+triangle.getCouleur().getName());
		polygon.setAttributeNode(style);
		polygon.setAttributeNode(points);
		svg.appendChild(polygon);
	}

	public void save() {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(this.doc);
			File file = new File("dessin.svg");
			StreamResult result = new StreamResult(file);
			transformer.transform(source, result);
			System.out.printf("File is located at %s%n", file.getAbsolutePath());
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
