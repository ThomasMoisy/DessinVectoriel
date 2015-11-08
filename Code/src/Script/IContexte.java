package script;

public interface IContexte<E> {
	public void bind(String identifiant, E valeur);
	public E lookup(String identifiant) throws Exception;
}
