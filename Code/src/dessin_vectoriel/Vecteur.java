package dessin_vectoriel;

public class Vecteur  {
	
	private Point origine;
	private Point image;
	
	public Vecteur(Point origine, Point image) {
		super();
		this.origine = origine;
		this.image = image;
	}
	public Point getOrigine() {
		return origine;
	}
	public void setOrigine(Point origine) {
		this.origine = origine;
	}
	public Point getImage() {
		return image;
	}
	public void setImage(Point image) {
		this.image = image;
	}
	
	public String toString() {
		return origine + "--" + image;
	}
	
	//BM : permet de calculer la norme
	public double norme(){
		int x1 = this.getOrigine().getX();
		int x2 = this.getImage().getX();
		int y1 = this.getOrigine().getY();
		int y2 = this.getImage().getY();
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	//BM : pourrait etre utile par la suite
	public boolean equals(Object o){
		if(!(o instanceof Vecteur)){
			return false;
		}
		else{
			return (this.getOrigine().equals(((Vecteur)o).getOrigine()))&&(this.getImage().equals(((Vecteur)o).getImage()));
		}
	}

}
