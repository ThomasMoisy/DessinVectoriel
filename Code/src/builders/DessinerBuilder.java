package builders;

import java.util.List;

import script.Script;
import dessin_vectoriel.Point;

/**
 * Builder de l'instruction dessiner
 *
 */
public class DessinerBuilder extends ScriptBuilder {

	/**
	 * dessine un cercle a partir d'un DessinerBuilder
	 * @return un CercleBuilder
	 */
	public CercleBuilder cercle() {
		return new CercleBuilder();
	};
	
	/**
	 * cree une liste de points a partir d'un DessinerBuilder
	 * @param points, une liste de points
	 * @return un PointsBuilder
	 */
	public ListePointsBuilder points(List<Point> points) {
		return new ListePointsBuilder();
	}

	/**
	 * dessine un triangle a partir d'un DessinerBuilder
	 * @return un TriangleBuilder
	 */
	public TriangleBuilder triangle() {
		return new TriangleBuilder();
	}

	@Override
	public Script script() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
