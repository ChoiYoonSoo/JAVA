//�ڵ��� Ŭ����
//������ ���
public class Car {
	private String color; // ����
	private int gear; // ���
	private int speed; // �ӵ�
	private int id;
	private String model; // ��
	private static int numbers = 0; // ����
	
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
