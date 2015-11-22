package traducteurs;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

import org.w3c.dom.Document;

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

public class TraducteurJAVA implements Traducteur {
	
	private Graphics2D g;

	public TraducteurJAVA(Graphics2D g) {
		super();
		this.g = g;
	}
	
	

	public Graphics2D getG() {
		return g;
	}



	public void setG(Graphics2D g) {
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
		
	}

	@Override
	public void traduire(Rectangle rectangle) {
		// TODO Auto-generated method stub
		if(rectangle.isVisibilite()){
			g.setColor(Color.getColor(rectangle.getCouleur().getName()));
			if(rectangle.isRemplissage()){
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
		if(cercle.isVisibilite()){
			g.setColor(Color.getColor("Color."+cercle.getCouleur().getName()));
			System.out.println(""+Color.getColor(cercle.getCouleur().getName()));
			if(cercle.isRemplissage()){
				g.fillOval(cercle.getBarycentre().getX(), cercle.getBarycentre().getY(), cercle.getR(), cercle.getR());
			}
			else{
				g.drawOval(cercle.getBarycentre().getX(), cercle.getBarycentre().getY(), cercle.getR(), cercle.getR());
			}
		}
	}

	@Override
	public void traduire(CheminOld chemin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traduire(Droite droite) {
		// TODO Auto-generated method stub
		if(droite.isVisibilite()){
			g.setColor(Color.getColor(droite.getCouleur().getName()));
			g.drawLine(droite.getVecteur().getOrigine().getX(), droite.getVecteur().getOrigine().getY(), droite.getVecteur().getImage().getX(), droite.getVecteur().getImage().getY());
		}
	}

	/*
	 * pour le moment l'étiquette est represente sur le barycentre
	 */
	@Override
	public void traduire(Etiquette etiquette) {
		// TODO Auto-generated method stub
		if(etiquette.isVisibilite()){
			g.setColor(Color.getColor(etiquette.getCouleur().getName()));
			g.drawString(etiquette.getTexte(), etiquette.getPosition().getX(),etiquette.getPosition().getY());
		}
	}

	

	@Override
	public void traduire(Triangle triangle) {
		// TODO Auto-generated method stub
		if(triangle.isVisibilite()){
			g.setColor(Color.getColor(triangle.getCouleur().getName()));
			int[] xPoints = new int[3];
			int[] yPoints = new int[3];
			
			xPoints[0]=triangle.getP1().getX();
			yPoints[0]=triangle.getP1().getY();
			
			xPoints[1]=triangle.getP2().getX();
			yPoints[1]=triangle.getP2().getY();
			
			xPoints[2]=triangle.getP3().getX();
			yPoints[2]=triangle.getP3().getY();
			
			if(triangle.isRemplissage()){
				g.fillPolygon(xPoints, yPoints, 3);
			}
			else{
				g.drawPolygon(xPoints, yPoints, 3);			}
		}
	}

	@Override
	public void traduire(Bezier bezier) {
		// TODO Auto-generated method stub
		if(bezier.isVisibilite()){
			g.setColor(Color.getColor(bezier.getCouleur().getName()));
			Path2D path = new Path2D.Float();
			path.curveTo(bezier.getArrivee().getX(), bezier.getArrivee().getY(), bezier.getControle().getX(), bezier.getControle().getY(), bezier.getArrivee().getX(), bezier.getArrivee().getY());
			g.draw(path);
		}
	}

	
}
