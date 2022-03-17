// 성적을 입력받아 그에 따른 학점 출력
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		System.out.println("성적을 입력하시오:");
		score = input.nextInt();
		
		if(score >= 90)
			System.out.println("학점 : A");
		else if(score >= 80)
			System.out.println("학점 : B");
		else if(score >=70)
			System.out.println("학점 : C");
		else
			System.out.println("학점 : F");
	}
}
