// ����ڷκ��� ���� �Է¹޾� Ȧ������ ¦������ �Ǻ�
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("������ �Է��Ͻÿ�:");
		n=input.nextInt();
		if(n % 2 == 0)
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		else
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
