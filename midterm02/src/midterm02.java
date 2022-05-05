import java.util.*;
public class midterm02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("양의 정수를 입력하시오 : ");
		n=input.nextInt();
		
		if(n<0) {
			System.out.println("양의 정수가 아닙니다.");
		}
		else {
			System.out.println(n+"의 약수는 다음과 같습니다.");
			for(int i = 1; i<=n; i++) {
				if(n % i == 0)
					System.out.print(i+" ");
			}
		}

	}

}
