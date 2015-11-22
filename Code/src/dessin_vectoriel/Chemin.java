package dessin_vectoriel;

import java.util.List;

import traducteurs.Traducteur;

public class Chemin extends Element{
	List<Bezier> beziers;
	
	public Chemin(boolean visibilite, Couleur couleur, int epaisseur) {
		super(visibilite, couleur, epaisseur);
	}
	

	@Override
	public void traduire(Traducteur traducteur) {
		for (Bezier bezier : beziers) {
			bezier.traduire(traducteur);
		}
	}
	
	
}
