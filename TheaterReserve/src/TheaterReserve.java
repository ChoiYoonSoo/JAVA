//���� ���� ���α׷�
import java.util.Scanner;

public class TheaterReserve {
	public static void main(String[] args) {
		int[] seat = new int[10];
		int n;
		Scanner s = new Scanner(System.in);
		
		for(int i=1; i<=seat.length; i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\n-  -  -  -  -  -  -  -  -  - ");
		
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+"  ");
		}
		
		while(true) {
			System.out.println("\n\n���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1) : ");
			n = s.nextInt();
			if(n == -1) {
				System.out.println("���Ÿ� �����մϴ�.");
				break;
			}
			else if (seat[n-1] !=0)
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			else if(seat[n-1] == 0){
				seat[n-1]=1;
				System.out.println("����Ǿ����ϴ�.\n");
				for(int i=1; i<=seat.length; i++) {
					System.out.print(i+"  ");
				}
				System.out.println("\n-  -  -  -  -  -  -  -  -  - ");
				
				for(int i=0; i<seat.length; i++) {
					System.out.print(seat[i]+"  ");
				}
				}
			}
			
		}
		
}
