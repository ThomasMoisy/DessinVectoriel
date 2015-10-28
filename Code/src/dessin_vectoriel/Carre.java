package dessin_vectoriel;

public class Carre extends Forme{
	
	
	
	private int cote;//represente la longueur du cote 
	private Vecteur diagonale;
	
	
	public Carre(boolean remplissage, boolean visibilite, Couleur couleur, Point barycentre, int cote,
			Vecteur diagonale) {
		super(remplissage, visibilite, couleur, barycentre);
		this.cote = cote;
		this.diagonale = diagonale;
	}
}
