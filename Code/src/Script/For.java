package script;

import dessin_vectoriel.Image;

/**
 * Instruction representant une boucle for 
 *
 */
public class For extends Script{
	private Sequence sequence;
	private String variable;
	private int n;

	public For(Sequence sequence, String variable, int n) {
		super();
		this.sequence = sequence;
		this.variable = variable;
		this.n = n;
	}


	@Override
	public Image executer(Image image) {
		for (int j = 0; j < n; j++) {
			image = sequence.executer(image);
		}
		return image;
	}

}
