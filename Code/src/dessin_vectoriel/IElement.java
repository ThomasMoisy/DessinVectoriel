package dessin_vectoriel;

public interface IElement {

	public boolean isVisibilite();
	public void setVisibilite(boolean visibilite);
	public Couleur getCouleur();
	public void setCouleur(Couleur couleur);
	public int getEpaisseur();
	public void setEpaisseur(int epaisseur);
}
