import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dB,dC;
		System.out.println("상수 b와 c를 입력하세요.");
		dB = input.nextDouble();
		dC = input.nextDouble();
		double dT = Math.sqrt(dB*dB-4*dC);
		double dResult1 = (-dB+dT)/2;
		double dResult2 = (-dB-dT)/2;
		System.out.println(dResult1+" or "+dResult2);
		
		boolean a;
		a = dT > 0;
		System.out.println(a);
	}
}