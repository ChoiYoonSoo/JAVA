// ����ڷκ��� �� ���� ������ �Է¹޾� �� �� ū�� ���
import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,max;
		System.out.println("n1 �Է�:");
		n1=input.nextInt();
		System.out.println("n2 �Է�:");
		n2=input.nextInt();
		
		if(n1 > n2)
			max = n1;
		else
			max = n2;
		System.out.println("�� �� ū ����: "+max);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
