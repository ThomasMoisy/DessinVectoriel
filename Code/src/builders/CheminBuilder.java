package builders;

import java.util.ArrayList;
import java.util.List;

import script.Dessiner;
import script.Script;
import dessin_vectoriel.Forme;

public class CheminBuilder extends FormeBuilder{
	List<Script> dessinerBeziers = new ArrayList<>();
	
	@Override
	public Forme getElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public CheminBuilder add(Script dessinerBezier) {
		dessinerBeziers.add(dessinerBezier);
		return this;
	}

	@Override
	public Script script() throws Exception {
		SequenceBuilder sequence = new SequenceBuilder(dessinerBeziers);
		return sequence.script();
	}

}
