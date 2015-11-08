package script;

import java.util.HashMap;

import builders.FormeBuilder;



@SuppressWarnings("serial")
public class ContexteForme extends HashMap<String, FormeBuilder> implements IContexte<FormeBuilder> {
	public static ContexteForme contexte = new ContexteForme();
	
	private ContexteForme() {
	}
	
	@Override
	public FormeBuilder lookup(String identifiant) throws Exception {
		return this.get(identifiant);
	}
	
	@Override
	public void bind(String identifiant, FormeBuilder forme) {
		this.put(identifiant, forme);
	}
}
