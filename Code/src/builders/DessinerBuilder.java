package builders;

import java.util.List;

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
	public PointsBuilder points(List<Point> points) {
		return new PointsBuilder();
	}

	/**
	 * dessine un triangle a partir d'un DessinerBuilder
	 * @return un TriangleBuilder
	 */
	public TriangleBuilder triangle() {
		return new TriangleBuilder();
	}
	
}
