package traducteurs;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Chemin;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Rectangle;
import dessin_vectoriel.Triangle;

public interface Traducteur {
	
	public void traduire(Image image);
	public void traduire(Chemin chemin);
	public void traduire(Rectangle rectangle);
	public void traduire(Cercle cercle);
	public void traduire(Droite droite);
	public void traduire(Etiquette etiquette);
	public void traduire(Triangle triangle);
	
}
