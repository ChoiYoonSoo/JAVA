import java.util.*;
public class �ִ����� {

	public static void main(String[] args) {
		int x,y,r=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ū �� �Է�: ");
		x = scan.nextInt();
		System.out.println("���� �� �Է�: ");
		y = scan.nextInt();
		
		while(y != 0) {
			r = x%y;
			x = y;
			y = r;
		}
		System.out.println(x);
	}

}
