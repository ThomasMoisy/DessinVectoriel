package dessin_vectoriel;

public class Couleur {
	
	public static final Integer bleu = 1;
	public static final Integer vert = 2;
	public static final Integer rouge = 3;
	public static final Integer jaune = 4;
	public static final Integer rose = 5;
	public static final Integer orange = 6;
	public static final Integer noir = 7;
	public static final Integer gris = 8;
	public static final Integer blanc = 9;
	
	private Integer couleur;
	
	public Couleur(Integer couleur){
		this.couleur = couleur;
	}
	
	public Integer getCouleur() {
		return couleur;
	}
	
	public void setCouleur(Integer couleur) {
		this.couleur = couleur;
	}

}
