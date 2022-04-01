//자동차 클래스
//생성자 사용
public class Car {
	private String color; // 색상
	private int gear; // 기어
	private int speed; // 속도
	private int id;
	private String model; // 모델
	private static int numbers = 0; // 갯수
	
	public Car(String c, int g, int s, String m) {
		color = c;
		gear = g;
		speed = s;
		id = ++numbers;
		model = m;
	}
	
	public static int getNumberOfCase() {
		return numbers;
	}
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + ", model=" + model + "]";
	}
	
	void changeGear(int g) { // 기어바꾸기
		gear=g;
	}
	void speedUp() { // 가속하기
		speed = speed + 20;
	}
	void speedDown() { // 감속하기
		speed = speed - 10;
	}
}
