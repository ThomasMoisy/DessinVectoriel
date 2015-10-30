package builders;

import java.util.List;

import dessin_vectoriel.Point;

public class DessinerBuilder {

	public CercleBuilder cercle() {
		return new CercleBuilder();
	};
	
	public PointsBuilder points(List<Point> points) {
		return new PointsBuilder();
	}

	public TriangleBuilder triangle() {
		return new TriangleBuilder();
	}
	
}
