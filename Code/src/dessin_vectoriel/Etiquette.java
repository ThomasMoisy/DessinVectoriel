package dessin_vectoriel;


//Eventuellement besoin de rajouter une taille et une position
public class Etiquette extends Element {
	
	private String texte;
	private Element associe;
	private Orientation orientation;

	public Etiquette(boolean visibilite, Couleur couleur, int epaisseur, String texte, Element associe,
			Orientation orientation) {
		super(visibilite, couleur, epaisseur);
		this.texte = texte;
		this.associe = associe;
		this.orientation = orientation;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Element getAssocie() {
		return associe;
	}

	public void setAssocie(Element associe) {
		this.associe = associe;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public static Etiquette creer(boolean visibilite, Couleur couleur, int epaisseur, String texte, Element associe,
			Orientation orientation){
		return new Etiquette(visibilite, couleur, epaisseur, texte, associe, orientation);
	}
	

}
