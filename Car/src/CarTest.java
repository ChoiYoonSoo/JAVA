// 자동차 동작
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("white",1,80,"S600");
		Car c2 = new Car("blue",2,20,"E500");
		int n= Car.getNumberOfCase();
		System.out.println("지금까지 생성된 자동차 수 = "+n);
	    System.out.println(c1.toString());
	    System.out.println(c2.toString());
	}

}