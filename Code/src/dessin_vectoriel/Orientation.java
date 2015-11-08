package dessin_vectoriel;

public enum Orientation {
	
	NORTH, SOUTH, EAST, WEST;
	
	public String getName(){
		switch (this) {
		case  NORTH:
			return "NORTH";
		case SOUTH:
			return "SOUTH";
		case EAST:
			return "EAST";
		case WEST:
			return "WEST";
		default:
			return null;
		}
	}

}
