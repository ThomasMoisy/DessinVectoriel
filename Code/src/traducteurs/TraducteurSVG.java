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

public class TraducteurSVG implements Traducteur{

	/*
	 * BM : Traduit les elements composant de l'image un par un
	 */
	@Override
	public void traduire(Image image) {
		// TODO Auto-generated method stub
		for (Element element : image.getElements()) {
			traduire(element);
		}
	}

	/*
	 * Traduit un element en appelant la methode traduire appropriee au type de l'element (Carre, Cercle, etc)
	 */
	
	@Override
	public void traduire(Element element) {
		// TODO Auto-generated method stub
		traduire(element);
	}

	@Override
	public void traduire(Bezier bezier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Carre carre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Cercle cercle) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

}
