package script;


public class AffectationVariable extends InstructionTerminale {
	String identifiant;
	float valeur;
	
	public AffectationVariable(String identifiant, float valeur) {
		super();
		this.identifiant = identifiant;
		this.valeur = valeur;
	}
		
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	@Override
	public void executer() {
		Contexte.contexte.bind(identifiant, valeur);
	}

}
