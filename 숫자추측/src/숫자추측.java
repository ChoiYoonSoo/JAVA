import java.util.*;
public class 숫자추측 {

	public static void main(String[] args) {
		int n,answer;
		int cnt=0;
		Scanner input = new Scanner(System.in);
		System.out.println("값 입력: ");
		answer = input.nextInt();
		
		do {
			System.out.println("찾을 값 입력: ");
			n = input.nextInt();
			cnt++;
			if(n < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			}
			else if(n > answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
			else {
				break;
			}
		}while(true);
		
		System.out.println("정답! "+n+"입니다 "+cnt+"번의 시도만에");
	}

}
