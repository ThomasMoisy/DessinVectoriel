package script;

import dessin_vectoriel.Image;

public interface IScript {

	/**
	 * methode pour executer un script et ajouter a l'image donnee en parametre
	 * les objets construits par l'instruction (le contenu du script)
	 * @param image sur laquelle ajouter les nouveaux objets
	 * @return une image avec les nouveaux objets ajoutes
	 */
	public Image executer(Image image);
}
