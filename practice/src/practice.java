//�迭 �����ϱ�
import java.util.*;
public class practice {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println((i+1)+"��° �迭�� �� �Է�");
			a[i]=scan.nextInt();
		}
		System.out.println("�Էµ� �迭 �����ϱ�.");
		Arrays.sort(a);
		
		System.out.println("���ĵ� �迭 ���.");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
