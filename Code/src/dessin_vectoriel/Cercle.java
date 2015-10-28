package dessin_vectoriel;

public class Cercle extends Forme implements IForme{

	

	private int R;

	public Cercle(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre, int r) {
		super(remplissage, visibilite, couleur, epaisseur, barycentre);
		R = r;
	}
	
	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerCercle
	public Cercle creer(boolean remplissage, boolean visibilite, Couleur couleur, int epaisseur, Point barycentre, int r){
		return new Cercle(remplissage, visibilite, couleur, epaisseur, barycentre,r);
	}

}
