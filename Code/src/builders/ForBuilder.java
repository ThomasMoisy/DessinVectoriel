package builders;

import script.For;
import script.Script;
import script.Sequence;

public class ForBuilder extends ScriptBuilder {
	private int n = 0; 
	private String variable;
	private Sequence sequence = new Sequence();

	public ForBuilder to(int i) {
		this.n = i;
		return this;
	}

	public ForBuilder variable(String variable) {
		this.variable = variable;
		return this;
	}
	
	public ForBuilder add(Script script) {
		sequence.add(script);
		return this;
	}

	public Script script() {
		return new For(sequence, variable, n);
	}

}
