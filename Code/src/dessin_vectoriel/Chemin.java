package dessin_vectoriel;

import java.util.List;

public class Chemin extends Element implements IElement {
	
	//BM : Un chemin trace de facon quelconque peut possiblement etre representer par une liste de vecteurs avec la contrainte qu un point image est l origine du vecteur suivant
	private List<Vecteur> vecteurs;

	public Chemin(boolean visibilite, Couleur couleur, int epaisseur, List<Vecteur> vecteurs) {
		super(visibilite, couleur, epaisseur);
		this.vecteurs = vecteurs;
	}

	public List<Vecteur> getVecteurs() {
		return vecteurs;
	}

	public void setVecteurs(List<Vecteur> vecteurs) {
		this.vecteurs = vecteurs;
	}
	
	//BM : peut etre utile par la suite
	public boolean estFerme(){
		if(vecteurs.size()==0){
			return false;
		}
		else{
			return (vecteurs.get(0).getOrigine().equals(vecteurs.get(vecteurs.size()-1).getImage()));
		}
	}
	
	//BM : peut etre a creer dans Element et dans ce cas a appeler creerChemin
	public static Chemin creer(boolean visibilite, Couleur couleur, int epaisseur, List<Vecteur> vecteurs){
		return new Chemin(visibilite, couleur, epaisseur, vecteurs);
	}

}
