//�ڵ��� Ŭ����
public class Car {
	String color="red"; // ����
	int gear=2; // ���
	int speed=80; // �ӵ�
	
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) { // ���ٲٱ�
		gear=g;
	}
	void speedUp() { // �����ϱ�
		speed = speed + 20;
	}
	void speedDown() { // �����ϱ�
		speed = speed - 10;
	}
}
