package dessin_vectoriel;

public class Point {

	private int X;
	private int Y;
	
	public Point(int x, int y) {
		super();
		X = x;
		Y = y;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public String toString() {
		return "(" + X + ", " + Y + ")";
	}
	
	//pourrait etre utile par la suite
	public boolean equals(Object o){
		if(!(o instanceof Point)){
			return false;
		}
		else{
			return (this.getX()==((Point)o).getX())&&(this.getY()==((Point)o).getY());
		}
	}
}
