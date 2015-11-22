package script;

import builders.ElementBuilder;
import dessin_vectoriel.Image;

/**
 * 
 * Classe representant l'instruction d'affectation d'une forme a une variable
 */
public class AffectationForme extends InstructionTerminale {

	String identifiant;
	ElementBuilder builder;
	
	public AffectationForme(String identifiant, ElementBuilder builder) {
		super();
		this.identifiant = identifiant;
		this.builder = builder;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public ElementBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ElementBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Image executer(Image image) {
		return image;
	}

}
