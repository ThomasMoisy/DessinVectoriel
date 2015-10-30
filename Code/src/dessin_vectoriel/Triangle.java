package dessin_vectoriel;

public class Triangle extends Forme implements IForme {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point p1, Point p2, Point p3) {
		super(remplissage, visibilite, couleur, epaisseur, new Point((p1.getX()+p1.getX()+p1.getX())/3, (p1.getY()+p1.getY()+p1.getY())/3));
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
}
