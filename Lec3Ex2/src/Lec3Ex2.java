// ���� ������ �Է� �ް� �� ������ ��� ����� ����ϴ� ���α׷�
import java.util.Scanner;
public class Lec3Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("���� ���� �Է�:");
		n = input.nextInt();
		System.out.println(n+"�� ����� ������ �����ϴ�.");
		
		for(int i = 1; i<=n; i++) {
			if(n % i == 0)
				System.out.print(i+" ");
		}

	}

}
