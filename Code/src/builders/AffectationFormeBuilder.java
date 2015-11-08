package builders;

import script.AffectationForme;
import script.ContexteForme;
import script.Script;

public class AffectationFormeBuilder extends ScriptBuilder{
	String identifiant;
	FormeBuilder builder;
	
	public AffectationFormeBuilder(String identifiant, FormeBuilder builder) {
		super();
		this.identifiant = identifiant;
		this.builder = builder;
	}
	
	@Override
	public Script script() throws Exception {
		ContexteForme.contexte.bind(identifiant, builder);
		return new AffectationForme(identifiant, builder);
	}

}
