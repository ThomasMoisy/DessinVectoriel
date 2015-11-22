package traducteurs;

import java.io.File;
import java.util.Iterator;
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
import dessin_vectoriel.BezierOld;
import dessin_vectoriel.Cercle;
import dessin_vectoriel.CheminOld;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Point;
import dessin_vectoriel.Rectangle;
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
		for (dessin_vectoriel.Element element : image.getElements()) {
			element.traduire(this);
		}
	}

	

	@Override
	/*
	 * TM : 
	 * Les courbes de Bezier en svg sont de deux types :
	 * 1. 	Courbes a quatre points A B C D qui s'écrivent ainsi :
	 *  		<path d="M10 10 C 20 20, 40 20, 50 10" fill="transparent"/>
	 *  	ou M precede le point de depart, et C indique que c'est une courbe cubique de Bezier.
	 * 2.	Courbes a plus de points, qui s'ecrivent ainsi :
	 * 			<path d="M10 80 C 40 10, 65 10, 95 80 S 150 150, 180 80" fill="transparent"/>
	 * 		ou on ajoute S et les points supplementaires 
	 * Attention: Ne prend pour l'instant en compte que les courbes de Bezier de quatre ou six points
	 */
	public void traduire(BezierOld bezier) {
		Element path = doc.createElement("path");
		List<Point> points = bezier.getPoints();
		Attr d = doc.createAttribute("d");
		
		String string = "M";
		int counter = 0;
		Iterator<Point> itrPts = points.iterator();
		while (itrPts.hasNext()) {
			Point pt = itrPts.next();
			string += pt.getX() + " " + pt.getY()+ " ";
			if (counter == 0) 						string += "C ";
			else if (counter == 1 || counter == 2)	string += ", ";
			else if (counter == 3)					string += "S ";
			else if (counter == 4)					string += ", ";
			counter++;
		}
		
		d.setValue(string);
		Attr style = doc.createAttribute("style");
		style.setValue("fill:"+bezier.getCouleur().getName());
		path.setAttributeNode(d);
		path.setAttributeNode(style);
		svg.appendChild(path);
	}

	@Override
	public void traduire(Rectangle rectangle) {
		//<rect width="300" height="100" style="fill="blue" />
		Element rect = doc.createElement("rect");
		Attr width = doc.createAttribute("width");
		width.setValue(rectangle.getLargeur()+ "");
		Attr height = doc.createAttribute("height");
		height.setValue(rectangle.getLongueur() + "");
		Attr style = doc.createAttribute("style");
		style.setValue("fill:"+rectangle.getCouleur().getName());
		rect.setAttributeNode(width);
		rect.setAttributeNode(height);
		rect.setAttributeNode(style);
		svg.appendChild(rect);
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
	public void traduire(CheminOld chemin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Droite droite) {
		// <line x1="0" y1="0" x2="200" y2="200" />
		
		Element line = doc.createElement("line");
		Attr x1 = doc.createAttribute("x1");
		x1.setValue(droite.getVecteur().getImage().getX()+ "");
		Attr y1 = doc.createAttribute("y1");
		y1.setValue(droite.getVecteur().getImage().getY()+ "");
		Attr x2 = doc.createAttribute("x2");
		x2.setValue(droite.getVecteur().getImage().getX()+ "");
		Attr y2 = doc.createAttribute("y2");
		y2.setValue(droite.getVecteur().getImage().getY()+ "");
		
		line.setAttributeNode(x1);
		line.setAttributeNode(y1);
		line.setAttributeNode(x2);
		line.setAttributeNode(y1);
		svg.appendChild(line);
	}

	@Override
	public void traduire(Etiquette etiquette) {
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

	@Override
	public void traduire(Bezier bezier) {
		Element path = doc.createElement("path");
		String s = "M " + bezier.getDepart().getX() + "," + bezier.getDepart().getY();
		s += " Q " + bezier.getControle().getX() + "," + bezier.getControle().getY();
		s += " " + bezier.getArrivee().getX() + "," + bezier.getArrivee().getY();
		Attr d = doc.createAttribute("d");
		d.setValue(s);
		Attr style = doc.createAttribute("style");
		style.setValue("fill:none;stroke-width:0.1em;stroke-linecap:round;stroke:limegreen;");
		path.setAttributeNode(d);
		path.setAttributeNode(style);
		svg.appendChild(path);
	}


}
