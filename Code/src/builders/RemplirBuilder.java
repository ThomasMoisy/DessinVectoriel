package builders;

import dessin_vectoriel.Couleur;
import script.ContexteForme;
import script.Script;

public class RemplirBuilder extends ScriptBuilder {
	FormeBuilder builder;

	public RemplirBuilder selectionne(String identifiant) throws Exception {
		builder = ContexteForme.contexte.lookup(identifiant);
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
