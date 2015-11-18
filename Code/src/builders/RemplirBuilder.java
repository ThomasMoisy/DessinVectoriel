package builders;

import dessin_vectoriel.Couleur;
import script.ContexteElement;
import script.Script;

public class RemplirBuilder extends ScriptBuilder {
	FormeBuilder builder;

	public RemplirBuilder selectionne(String identifiant) throws Exception {
		builder = (FormeBuilder) ContexteElement.contexte.lookup(identifiant);
		return this;
	}
	
	public RemplirBuilder couleur(Couleur couleur) {
		builder.setRemplissage(true);
		builder.setCouleur(couleur);
		return this;
	}
	
	@Override
	public Script script() throws Exception {
		return builder.script();
	}

	

}
