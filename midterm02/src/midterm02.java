import java.util.*;
public class midterm02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		n=input.nextInt();
		
		if(n<0) {
			System.out.println("���� ������ �ƴմϴ�.");
		}
		else {
			System.out.println(n+"�� ����� ������ �����ϴ�.");
			for(int i = 1; i<=n; i++) {
				if(n % i == 0)
					System.out.print(i+" ");
			}
		}

	}

}
