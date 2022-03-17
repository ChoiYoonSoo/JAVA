// 월의 일수를 출력하는 프로그램
import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month,days=0;
		System.out.println("일수를 알고 싶은 월을 입력하시오:");
		month = input.nextInt();
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println("월의 일수 : "+days);

	}

}
