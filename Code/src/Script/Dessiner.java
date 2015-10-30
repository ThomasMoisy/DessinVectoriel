package script;

import java.util.List;

import dessin_vectoriel.Couleur;
import dessin_vectoriel.IElement;

public class Dessiner extends InstructionTerminale{
	private List<IElement> elements;
	private Couleur couleur;
	

	public Dessiner(List<IElement> elements, Couleur couleur) {
		super();
		this.elements = elements;
		this.couleur = couleur;
	}


	@Override
	public void executer() {
		// TODO Auto-generated method stub
		
	}
	
	

}
