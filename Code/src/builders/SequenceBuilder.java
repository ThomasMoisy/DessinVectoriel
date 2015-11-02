package builders;

import java.util.ArrayList;
import java.util.List;

import script.Script;
import script.Sequence;

/**
 * 
 * Builder pour creer le script Sequence
 * 
 */
public class SequenceBuilder extends ScriptBuilder {
	private List<Script> scripts = new ArrayList<Script>();

	public SequenceBuilder() {
	}
	
	public SequenceBuilder(List<Script> scripts) {
		super();
		this.scripts = scripts;
	}
	
	/**
	 * ajoute un script a la liste de script de la sequence
	 * @param s
	 * @return un SequenceBuilder
	 */
	public SequenceBuilder add(Script s) {
		scripts.add(s);
		return this;
	}

	/**
	 * genere un Script a partir du builder
	 * une fois que tous les parametres ont ete regles
	 * @return
	 */
	public Script script() {
		return new Sequence(scripts);
	}
}
