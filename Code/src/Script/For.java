package script;

import dessin_vectoriel.Image;

/**
 * Instruction representant une boucle for 
 *
 */
public class For extends Script{
	private Sequence sequence;

	public For(Sequence sequence) {
		super();
		this.sequence = sequence;
	}


	@Override
	public Image executer(Image image) {
		image = sequence.executer(image);
		return image;
	}

}
