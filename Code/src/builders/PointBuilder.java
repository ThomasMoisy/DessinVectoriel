package builders;

import script.Contexte;
import dessin_vectoriel.Couleur;
import dessin_vectoriel.Point;

public class PointBuilder {
	private Object x;
	private Object y;
	private Couleur couleur;
	
	public PointBuilder(Object x, Object y, Couleur couleur) {
		super();
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}

	public Point execute() throws Exception {
		Point p;
		if (this.x instanceof Integer) {
			if (this.y instanceof Integer) {
				p = Point.creer((int)x, (int)y);
			}
			else if (this.y instanceof String) {
				int yy = Contexte.contexte.lookup((String)y);
				p = Point.creer((int)x, yy);
			}
			else {
				throw new Error();
			}
		}
		else if (this.x instanceof String) {
			if (this.y instanceof Integer) {
				int xx = Contexte.contexte.lookup((String)x);
				p = Point.creer(xx, (int)y);
			}
			else if (this.y instanceof String) {
				int yy = Contexte.contexte.lookup((String)y);
				int xx = Contexte.contexte.lookup((String)x);
				p = Point.creer(xx, yy);
			}
			else {
				throw new Error();
			}
		}
		else {
			throw new Error();
		}
		return p;
	}

}
