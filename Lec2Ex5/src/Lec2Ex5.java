// 파이 구하는 프로그램
import java.util.Scanner;
public class Lec2Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dN;
		double dPI=0;
		double dX=4,dY=1;
		System.out.println("반복횟수 입력: ");
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
		System.out.println("입력받은 PI: "+dPI);
	}

}
