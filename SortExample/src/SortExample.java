// ���� ���ڸ� �迭�� �����Ͽ� ����
import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i=0; i<SIZE; i++) {
			int r=(int)(Math.random() * 100); // ���� ���� �� �����ε� �κи� ����
			numbers[i]=r;
		}
		
		System.out.print("������ ����Ʈ: ");
		for(int r : numbers)
			System.out.print(r+" ");
		Arrays.sort(numbers); // �迭 ���Ľ�Ű��
		System.out.println("\n���ĵ� ����Ʈ: ");
		for(int r:numbers)
			System.out.print(r+" ");
	}
	

}
