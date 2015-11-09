package traducteurs;

import dessin_vectoriel.Bezier;
import dessin_vectoriel.Carre;
import dessin_vectoriel.Cercle;
import dessin_vectoriel.Chemin;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Element;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Point;
import dessin_vectoriel.Triangle;

public interface Traducteur {
	public void traduire(Image image);
	public void traduire(Element element);
	public void traduire(Bezier bezier);
	public void traduire(Carre carre);
	public void traduire(Cercle cercle);
	public void traduire(Chemin chemin);
	public void traduire(Droite droite);
	public void traduire(Etiquette etiquette);
	public void traduire(Point point);
	public void traduire(Triangle triangle);
	
}
