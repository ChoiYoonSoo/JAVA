//배열 정렬하기
import java.util.*;
public class practice {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println((i+1)+"번째 배열의 값 입력");
			a[i]=scan.nextInt();
		}
		System.out.println("입력된 배열 정렬하기.");
		Arrays.sort(a);
		
		System.out.println("정렬된 배열 출력.");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
