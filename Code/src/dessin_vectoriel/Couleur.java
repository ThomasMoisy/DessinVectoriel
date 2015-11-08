package dessin_vectoriel;

public enum Couleur {
	
	BLEU, VERT, ROUGE, JAUNE, ROSE, ORANGE, NOIR, GRIS, BLANC ;
	
	/*
	public static final Integer bleu = 1;
	public static final Integer vert = 2;
	public static final Integer rouge = 3;
	public static final Integer jaune = 4;
	public static final Integer rose = 5;
	public static final Integer orange = 6;
	public static final Integer noir = 7;
	public static final Integer gris = 8;
	public static final Integer blanc = 9;
	*/
	
	
	
	public String getName() {
		switch (this) {
		case  BLEU:
			return "bleu";
		case VERT:
			return "bleu";
		case ROUGE:
			return "bleu";
		case JAUNE:
			return "bleu";
		case ROSE:
			return "bleu";
		case ORANGE:
			return "bleu";
		case NOIR:
			return "bleu";
		case GRIS:
			return "bleu";
		case BLANC:
			return "bleu";
		default:
			return null;
		}
	}

}
