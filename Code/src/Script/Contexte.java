package script;

import java.util.HashMap;

/**
 * Classe qui servira a memoriser l'etat des variables 
 * @author 
 *
 * @param <E>
 */

@SuppressWarnings("serial")
public class Contexte extends HashMap<String, Integer> implements IContexte{
	public static Contexte contexte = new Contexte();
	
	private Contexte() {
	}
	
	@Override
	public int lookup(String identifiant) throws Exception {
		return this.get(identifiant);
	}
	
	@Override
	public void bind(String identifiant, int valeur) {
		this.put(identifiant, valeur);
	}
	
}
