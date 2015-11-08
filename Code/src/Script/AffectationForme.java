package script;

import builders.FormeBuilder;
import dessin_vectoriel.Forme;
import dessin_vectoriel.Image;

/**
 * 
 * Classe representant l'instruction d'affectation d'une forme a une variable
 */
public class AffectationForme extends InstructionTerminale {

	String identifiant;
	FormeBuilder builder;
	
	public AffectationForme(String identifiant, FormeBuilder builder) {
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

	public FormeBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(FormeBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Image executer(Image image) {
		return image;
	}

}
