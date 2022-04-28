// 도형예제(상속)
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(10,20);
		
		r1.setX(5);
		r1.setY(3);
		
		r2.setX(8);
		r2.setY(9);
		
		r1.print();
		r1.draw();
		System.out.println("r1의 면적: "+r1.area());
		
		r2.print();
		r2.draw();
		System.out.println("r2의 면적: "+r2.area());
	}

}
