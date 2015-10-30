package script;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Script{
	private List<Script> scripts = new ArrayList<Script>();
	
	public Sequence(List<Script> scripts) {
		super();
		this.scripts = scripts;
	}	

	public Sequence() {
	}
	
	public List<Script> getScripts() {
		return scripts;
	}

	public void setScripts(List<Script> scripts) {
		this.scripts = scripts;
	}
	
	public void add(Script d2) {
		scripts.add(d2);
	}

	@Override
	public void executer() {
		for (Script script : scripts) {
			script.executer();
		}
	}
	
}
