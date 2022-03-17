import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		boolean y;
		System.out.println("해를 입력하세요.");
		year = input.nextInt();
		y = (year % 4) == 0;
		System.out.println("입력받은 해는 윤년이 "+y+"입니다.");
	}

}
