// 순차탐색 프로그램
import java.util.*;
public class search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s[] = {0,11,18,29,35,49,62,68,73,88,100};
		int n;
		int idx = 0;
		int max=0,min=0;
		System.out.print("정수 값 입력: ");
		n = input.nextInt();
		
		for(int i=0; i<s.length; i++) {
			
			if(n == s[i]) {
				idx = i+1;
				System.out.println(n+"은 "+idx+"번째에 있습니다.");
			}
			else if(n > s[i])
				min = s[i];
			else if (n < s[i]) {
				max = s[i];
				break;
			}		
		}
		
		if(n < s[0]) { // 배열의 첫번째값보다 n이 작을때 출력
			System.out.println(n+"은(는) "+max+"보다 작습니다.");
		}
		else if(n > s[10]) { // 배열의 마지막번째 값보다 n이 클때 출력
			System.out.println(n+"은(는) "+min+"보다 큽니다.");
		}
		else // 배열 사이에 값이 있을경우 출력
			System.out.println(n+"은(는) "+min+"보다 크고 " +max+ "보다 작습니다.");
		
	}

}
