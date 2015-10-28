package dessin_vectoriel;

public interface IForme extends IElement {

	public boolean isRemplissage();
	public void setRemplissage(boolean remplissage);
	public boolean isVisibilite();
	public void setVisibilite(boolean visibilite);
	public Couleur getCouleur();
	public void setCouleur(Couleur couleur);
	public Point getBarycentre();
	public void setBarycentre(Point barycentre);
}
