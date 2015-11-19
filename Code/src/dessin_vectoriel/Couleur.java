package dessin_vectoriel;

public enum Couleur {
	
	BLUE, GREEN, RED, YELLOW, PINK, ORANGE, BLACK, GREY, WHITE ;
	
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
		return this.name().toLowerCase();
	}

}
