package builders;

import dessin_vectoriel.Point;

public abstract class FormeBuilder extends ElementBuilder{
	
	boolean remplissage = false;
	Point barycentre;
	
	public FormeBuilder barycentre(Point barycentre){
		this.barycentre = barycentre;
		return this;
	}
	
	public void setRemplissage(boolean remplissage) {
		this.remplissage = remplissage;
	}
	
}
