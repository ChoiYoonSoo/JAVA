import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		boolean y;
		System.out.println("�ظ� �Է��ϼ���.");
		year = input.nextInt();
		y = (year % 4) == 0;
		System.out.println("�Է¹��� �ش� ������ "+y+"�Դϴ�.");
	}

}
