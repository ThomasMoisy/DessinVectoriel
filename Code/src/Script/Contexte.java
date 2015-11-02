package script;

import java.util.HashMap;

/**
 * Classe qui servira a memoriser l'etat des variables 
 * @author 
 *
 * @param <E>
 */

@SuppressWarnings("serial")
public class Contexte<E> extends HashMap<String, E> implements IContexte<E>{
	public static Contexte<Object> contexte = new Contexte<Object>();
	
	private Contexte() {
	}
	
	@Override
	public E lookup(String identifiant) throws Exception {
		return lookup(identifiant);
	}
	@Override
	public void bind(String identifiant, E valeur) {
		put(identifiant, valeur);
	}
	
}
