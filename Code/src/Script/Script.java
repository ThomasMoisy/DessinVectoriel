package Script;

import java.util.ArrayList;
import java.util.List;

public abstract class Script implements IScript {
	
	//Devra peut-etre etre un Singleton
	private static IContexte contexte;
	
	//Juste pour voir une idee de ce a quoi ca ressemble
	public static void main(String[] args) {
		Script dessiner = new Dessiner();
		Script boucle = new Boucle();
		List<Script> scripts = new ArrayList<Script>();
		scripts.add(dessiner);
		scripts.add(boucle);
		Script S = new Sequence(scripts);
		S.execute();
		
		
	}
}
