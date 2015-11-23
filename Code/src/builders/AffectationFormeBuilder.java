package builders;

import script.AffectationForme;
import script.ContexteElement;
import script.Script;

/**
 * AffectationFormeBuilder qui permet d'affecter une forme à une variable
 */
public class AffectationFormeBuilder extends ScriptBuilder{
	String identifiant;
	ElementBuilder builder;
	
	public AffectationFormeBuilder(String identifiant, ElementBuilder builder) {
		super();
		this.identifiant = identifiant;
		this.builder = builder;
	}
	
	@Override
	public Script script() throws Exception {
		ContexteElement.contexte.bind(identifiant, builder);
		return new AffectationForme(identifiant, builder);
	}

}
