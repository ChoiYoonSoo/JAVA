
public class Circle {
	public int radius;
	public Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	public String toString() {
		return "Circle [radius="+radius+", center"+center+"]";
	}
}
