package script;

import java.util.HashMap;

import builders.ElementBuilder;



@SuppressWarnings("serial")
public class ContexteElement extends HashMap<String, ElementBuilder> implements IContexte<ElementBuilder> {
	public static ContexteElement contexte = new ContexteElement();
	
	private ContexteElement() {
	}
	
	@Override
	public ElementBuilder lookup(String identifiant) throws Exception {
		return this.get(identifiant);
	}
	
	@Override
	public void bind(String identifiant, ElementBuilder element) {
		this.put(identifiant, element);
	}
}
