// ������ �Է¹޾� �׿� ���� ���� ���
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		System.out.println("������ �Է��Ͻÿ�:");
		score = input.nextInt();
		
		if(score >= 90)
			System.out.println("���� : A");
		else if(score >= 80)
			System.out.println("���� : B");
		else if(score >=70)
			System.out.println("���� : C");
		else
			System.out.println("���� : F");
	}
}
