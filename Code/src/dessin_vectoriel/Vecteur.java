package dessin_vectoriel;

public class Vecteur {
	
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
	
	

}
