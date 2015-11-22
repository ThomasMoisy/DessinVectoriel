package traducteurs;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.lang.reflect.Field;

import org.w3c.dom.Document;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Chemin;
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
	public void traduire(Rectangle rectangle) {
		// TODO Auto-generated method stub
		if(rectangle.isVisibilite()){
			Color color;
			try {
			    Field field = Color.class.getField(rectangle.getCouleur().getName());
			    color = (Color)field.get(null);
			} catch (Exception e) {
			    color = null; // Not defined
			}
			g.setColor(color);
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
			Color color;
			try {
			    Field field = Color.class.getField(cercle.getCouleur().getName());
			    color = (Color)field.get(null);
			} catch (Exception e) {
			    color = null; // Not defined
			}
			g.setColor(color);
			if(cercle.isRemplissage()){
				g.fillOval(cercle.getBarycentre().getX(), cercle.getBarycentre().getY(), cercle.getR(), cercle.getR());
			}
			else{
				g.drawOval(cercle.getBarycentre().getX(), cercle.getBarycentre().getY(), cercle.getR(), cercle.getR());
			}
		}
	}



	@Override
	public void traduire(Droite droite) {
		// TODO Auto-generated method stub
		if(droite.isVisibilite()){
			Color color;
			try {
			    Field field = Color.class.getField(droite.getCouleur().getName());
			    color = (Color)field.get(null);
			} catch (Exception e) {
			    color = null; // Not defined
			}
			g.setColor(color);
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
			Color color;
			try {
			    Field field = Color.class.getField(etiquette.getCouleur().getName());
			    color = (Color)field.get(null);
			} catch (Exception e) {
			    color = null; // Not defined
			}
			g.setColor(color);
			g.drawString(etiquette.getTexte(), etiquette.getPosition().getX(),etiquette.getPosition().getY());
		}
	}

	

	@Override
	public void traduire(Triangle triangle) {
		// TODO Auto-generated method stub
		if(triangle.isVisibilite()){
			Color color;
			try {
			    Field field = Color.class.getField(triangle.getCouleur().getName());
			    color = (Color)field.get(null);
			} catch (Exception e) {
			    color = null; // Not defined
			}
			g.setColor(color);
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
	public void traduire(Chemin chemin) {
		// TODO Auto-generated method stub
		Color color;
		try {
		    Field field = Color.class.getField(chemin.getCouleur().getName());
		    color = (Color)field.get(null);
		} catch (Exception e) {
		    color = null; // Not defined
		}
		g.setColor(color);
		Path2D path = new Path2D.Float();
		Point depart = chemin.getDepart();
		int size = chemin.getPoints().size();
		for (int i = 0; i < size/2; i++) {
			path.moveTo(depart.getX(),depart.getY());
			path.curveTo(chemin.getPoints().get(2*i).getX(),chemin.getPoints().get(2*i).getY() , chemin.getPoints().get(2*i).getX(), chemin.getPoints().get(2*i).getY(),chemin.getPoints().get(2*i+1).getX(), chemin.getPoints().get(2*i+1).getY());
			g.draw(path);
			depart = chemin.getPoints().get(2*i+1);
		}
	}

	
}
