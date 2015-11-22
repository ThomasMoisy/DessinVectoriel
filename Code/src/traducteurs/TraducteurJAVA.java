package traducteurs;

import java.awt.Graphics2D;

import org.w3c.dom.Document;

import dessin_vectoriel.Bezier;
import dessin_vectoriel.BezierOld;
import dessin_vectoriel.Carre;
import dessin_vectoriel.Cercle;
import dessin_vectoriel.CheminOld;
import dessin_vectoriel.Droite;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Image;
import dessin_vectoriel.Point;
import dessin_vectoriel.Rectangle;
import dessin_vectoriel.Triangle;

public class TraducteurJAVA implements Traducteur {
	
	private Graphics2D g;

	public TraducteurJAVA(Graphics2D g) {
		super();
		this.g = g;
	}

	@Override
	public void traduire(Image image) {
		// TODO Auto-generated method stub
		for (dessin_vectoriel.Element element : image.getElements()) {
			element.traduire(this);
		}
	}

	@Override
	public void traduire(BezierOld bezier) {
		// TODO Auto-generated method stub
		g.draw
	}

	@Override
	public void traduire(Rectangle rectangle) {
		// TODO Auto-generated method stub
		if(rectangle.isVisibilite()){
			if(rectangle.isRemplissage()){
				Rectangle rectangle = new Rec
				g.fillRect(rectangle.getBarycentre().getX()-rectangle.getLargeur()/2, rectangle.getBarycentre().getY()-rectangle.getLongueur()/2, rectangle.getLargeur(), rectangle.getLongueur());
			}
			else{
				g.drawRect(rectangle.getBarycentre().getX()-rectangle.getLargeur()/2, rectangle.getBarycentre().getY()-rectangle.getLongueur()/2, rectangle.getLargeur(), rectangle.getLongueur());
			}
		}
	}

	@Override
	public void traduire(Cercle cercle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(CheminOld chemin) {
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

	@Override
	public void traduire(Bezier bezier) {
		// TODO Auto-generated method stub
		
	}

	
}
