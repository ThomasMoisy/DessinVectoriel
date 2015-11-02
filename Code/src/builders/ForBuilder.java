package builders;

import script.For;
import script.Script;
import script.Sequence;

/**
 * 
 * Builder de l'instruction for
 * 
 */
public class ForBuilder extends ScriptBuilder {
	private int n = 0; 
	private String variable;
	private Sequence sequence = new Sequence();

	/**
	 * regle le nombre d'iterations de la boucle
	 * @param i, le nombre d'iterations
	 * @return un ForBuilder
	 */
	public ForBuilder to(int i) {
		this.n = i;
		return this;
	}

	/**
	 * regle le nom de la variable d'iterations de la boucle i 
	 * @param variable
	 * @return un ForBuilder
	 */
	public ForBuilder variable(String variable) {
		this.variable = variable;
		return this;
	}
	
	/**
	 * ajoute un script a la sequence de scripts qui seront executes dans la boucle for
	 * @param script 
	 * @return un ForBuilder
	 */
	public ForBuilder add(Script script) {
		sequence.add(script);
		return this;
	}

	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return
	 */
	public Script script() {
		return new For(sequence, variable, n);
	}

}
