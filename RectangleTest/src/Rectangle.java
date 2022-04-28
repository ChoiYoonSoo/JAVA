
public class Rectangle extends Shape {
	private int width;
	private int height;
	
	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}
	
	public double area() {
		return (double)width * height;
	}
	
	public void draw() {
		System.out.println("("+this.getX()+","+this.getY()+") ��ġ�� ����: "+width+" ����: "+height);
	}
}
