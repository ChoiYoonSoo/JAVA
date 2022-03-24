// 랜덤 숫자를 배열에 저장하여 정렬
import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int r=(int)(Math.random() * 100); // 랜덤 숫자 중 정수로된 부분만 저장
			numbers[i]=r;
		}
		
		System.out.print("최초의 리스트: ");
		for(int r : numbers)
			System.out.print(r+" ");
		Arrays.sort(numbers); // 배열 정렬시키기
		System.out.println("\n정렬된 리스트: ");
		for(int r:numbers)
			System.out.print(r+" ");
	}
	

}
