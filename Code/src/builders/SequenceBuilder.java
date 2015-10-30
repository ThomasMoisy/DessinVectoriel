package builders;

import java.util.ArrayList;
import java.util.List;

import script.Script;
import script.Sequence;

public class SequenceBuilder extends ScriptBuilder {
	private List<Script> scripts = new ArrayList<Script>();

	public SequenceBuilder() {
	}
	
	public SequenceBuilder(List<Script> scripts) {
		super();
		this.scripts = scripts;
	}
	
	public SequenceBuilder add(Script s) {
		scripts.add(s);
		return this;
	}

	public Script script() {
		return new Sequence(scripts);
	}
}
