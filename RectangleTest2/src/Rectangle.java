
public class Rectangle extends Shape {
	private int width;
	private int height;
	
	Rectangle(int w, int h,int x, int y){
		super(x,y);
		this.width = w;
		this.height = h;
	}
	
	public double area() {
		return (double)width*height;
	}
	
	public void drew() {
		System.out.println("��ġ�� ����: "+width+" ����: "+height);
	}
}
