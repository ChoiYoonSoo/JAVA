// 사용자로부터 정수 입력받아 홀수인지 짝수인지 판별
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("정수를 입력하시오:");
		n=input.nextInt();
		if(n % 2 == 0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");

		System.out.println("프로그램이 종료되었습니다.");
	}

}
