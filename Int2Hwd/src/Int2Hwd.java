// ������ �ѱ۷� ����ϴ� ���α׷�
import java.util.Scanner;
public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		n = input.nextInt();
		
		switch(n) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
			break;
		}

	}

}
