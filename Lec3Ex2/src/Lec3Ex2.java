// 양의 정수를 입력 받고 그 정수의 모든 약수를 출력하는 프로그램
import java.util.Scanner;
public class Lec3Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("양의 정수 입력:");
		n = input.nextInt();
		System.out.println(n+"의 약수는 다음과 같습니다.");
		
		for(int i = 1; i<=n; i++) {
			if(n % i == 0)
				System.out.print(i+" ");
		}

	}

}
