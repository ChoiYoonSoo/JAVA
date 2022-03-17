// 사용자로부터 두 개의 정수를 입력받아 둘 중 큰수 출력
import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,max;
		System.out.println("n1 입력:");
		n1=input.nextInt();
		System.out.println("n2 입력:");
		n2=input.nextInt();
		
		if(n1 > n2)
			max = n1;
		else
			max = n2;
		System.out.println("둘 중 큰 수는: "+max);
		System.out.println("프로그램이 종료되었습니다.");
	}

}
