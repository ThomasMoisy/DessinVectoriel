package script;

import java.util.HashMap;

/**
 * Classe qui servira a memoriser l'etat des variables 
 * @author 
 *
 * @param <E>
 */

@SuppressWarnings("serial")
public class Contexte extends HashMap<String, Integer> implements IContexte<Integer>{
	public static Contexte contexte = new Contexte();
	
	private Contexte() {
	}
	
	@Override
	public Integer lookup(String identifiant) throws Exception {
		return this.get(identifiant);
	}
	
	@Override
	public void bind(String identifiant, Integer valeur) {
		this.put(identifiant, valeur);
	}
	
}
