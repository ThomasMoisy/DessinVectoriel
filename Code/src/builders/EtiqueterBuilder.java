package builders;

import dessin_vectoriel.Etiquette;
import script.ContexteForme;
import script.Script;

public class EtiqueterBuilder extends ScriptBuilder {
	
	private FormeBuilder forme;
	private EtiquetteBuilder etiquette;
	
	public EtiqueterBuilder() {
		// TODO Auto-generated constructor stub
		
	}
	
	public EtiqueterBuilder selectionne(String identifiant) throws Exception {
		forme = ContexteForme.contexte.lookup(identifiant);
		return this;
	}
	
	public Etiquette etiquette(){
		
	}

	@Override
	public Script script() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
