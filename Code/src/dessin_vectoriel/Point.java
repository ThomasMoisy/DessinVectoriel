package dessin_vectoriel;

import traducteurs.Traducteur;

public class Point extends Element {

	private int X;
	private int Y;
	
	
	public Point(boolean visibilite, Couleur couleur, int epaisseur, int x, int y) {
		super(visibilite, couleur, epaisseur);
		X = x;
		Y = y;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public String toString() {
		return "(" + X + ", " + Y + ")";
	}
	
	//pourrait etre utile par la suite
	public boolean equals(Object o){
		if(!(o instanceof Point)){
			return false;
		}
		else{
			return (this.getX()==((Point)o).getX())&&(this.getY()==((Point)o).getY());
		}
	}
	//BM : par default construction d'un point non visible qui sert juste de base de construction aux autres formes
	public static Point creer(int x, int y){
		return new Point(false,null, 0,  x,  y);
	}
	
	public static Point creer(boolean visibilite, Couleur couleur, int epaisseur, int x, int y){
		return new Point(visibilite,couleur, epaisseur,  x,  y);
	}
	
	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}
}
