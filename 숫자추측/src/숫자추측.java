import java.util.*;
public class �������� {

	public static void main(String[] args) {
		int n,answer;
		int cnt=0;
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�: ");
		answer = input.nextInt();
		
		do {
			System.out.println("ã�� �� �Է�: ");
			n = input.nextInt();
			cnt++;
			if(n < answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else if(n > answer) {
				System.out.println("������ ������ �����ϴ�.");
			}
			else {
				break;
			}
		}while(true);
		
		System.out.println("����! "+n+"�Դϴ� "+cnt+"���� �õ�����");
	}

}
