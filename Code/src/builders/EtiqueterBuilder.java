package builders;

import java.util.ArrayList;
import java.util.List;

import dessin_vectoriel.Cercle;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Element;
import dessin_vectoriel.Etiquette;
import dessin_vectoriel.Orientation;
import script.Dessiner;
import script.Etiqueter;
import script.Script;

public class EtiqueterBuilder extends ScriptBuilder{

	private String texte;
	private Element associe;
	private Couleur couleur;
	private Orientation orientation;
	private int epaisseur;
	
	public EtiqueterBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	//BM : Permet de choisir quel element va etre etiqueter selon son identifiant
	public EtiqueterBuilder etiqueter(String identifiant) throws Exception {
		associe = ContexteElement.contexte.lookup(identifiant);
		return this;
	}
	
	public EtiqueterBuilder texte(String texte) throws Exception {
		this.texte = texte;
		return this;
	}
	
	
	public EtiqueterBuilder orientation(Orientation orientation) throws Exception {
		this.orientation=orientation;
		return this;
	}
	
	public EtiqueterBuilder couleur(Couleur couleur) throws Exception {
		this.couleur=couleur;
		return this;
	}
	
	public EtiqueterBuilder epaisseur(int epaisseur) throws Exception {
		this.epaisseur=epaisseur;
		return this;
	}

	@Override
	public Script script() throws Exception {
		// TODO Auto-generated method stub
		Etiquette etiquette = Etiquette.creer(true, couleur, epaisseur, texte, null, orientation);
		return new Etiqueter(associe, etiquette);
	}
	
	
	
}
