package dessin_vectoriel;

import traducteurs.Traducteur;

//Eventuellement besoin de rajouter une taille et une position
public class Etiquette extends Element {
	
	private String texte;
	private Element associe;
	private Orientation orientation;
	private Point position;

	public Etiquette(boolean visibilite, Couleur couleur, int epaisseur, String texte, Element associe,
			Orientation orientation, Point position) {
		super(visibilite, couleur, epaisseur);
		this.texte = texte;
		this.associe = associe;
		this.orientation = orientation;
		this.position = position;
	}

	
	
	public Point getPosition() {
		return position;
	}



	public void setPosition(Point position) {
		this.position = position;
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
			Orientation orientation,Point position){
		return new Etiquette(visibilite, couleur, epaisseur, texte, associe, orientation, position);
	}
	
	@Override
	public void traduire(Traducteur traducteur) {
		// TODO Auto-generated method stub
		traducteur.traduire(this);
	}

}
