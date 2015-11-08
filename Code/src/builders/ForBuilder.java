package builders;

import java.util.ArrayList;
import java.util.List;

import script.Contexte;
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
	private List<ScriptBuilder> builders = new ArrayList<ScriptBuilder>();

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
	/*public ForBuilder add(Script script) {
		for (int i = 0; i < n; i++) {
			Contexte.contexte.bind(this.variable, i);
			sequence.add(script);
		}
		return this;
	}*/
	public ForBuilder add(ScriptBuilder builder) {
		builders.add(builder);
		return this;
	}

	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return
	 * @throws Exception 
	 */
	public Script script() throws Exception {
		for (int i = 0; i <n; i++) {
			Contexte.contexte.bind(variable, i);
			for (ScriptBuilder builder : builders) {
				Script s = builder.script();
				sequence.add(s);
			}
		}
		return new For(sequence);
	}

}
