//자동차 클래스
public class Car {
	String color="red"; // 색상
	int gear=2; // 기어
	int speed=80; // 속도
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
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
