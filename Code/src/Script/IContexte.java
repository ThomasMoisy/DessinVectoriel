package script;

public interface IContexte {
	public void bind(String identifiant, int valeur);
	public int lookup(String identifiant) throws Exception;
}
