// ���� ���ϴ� ���α׷�
import java.util.Scanner;
public class Lec2Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dN;
		double dPI=0;
		double dX=4,dY=1;
		System.out.println("�ݺ�Ƚ�� �Է�: ");
		dN = input.nextDouble();
		
		for(int i=1; i<=dN; i++) {
			if(i % 2 != 0) {
				dPI += dX/dY;
			}
			else if(i % 2 == 0) {
				dPI += (dX/dY)*-1;
			}
			dY+=2;
		}
		System.out.println("�Է¹��� PI: "+dPI);
	}

}
