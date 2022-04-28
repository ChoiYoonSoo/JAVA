import java.util.*;
public class 최대공약수 {

	public static void main(String[] args) {
		int x,y,r=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("큰 수 입력: ");
		x = scan.nextInt();
		System.out.println("작은 수 입력: ");
		y = scan.nextInt();
		
		while(y != 0) {
			r = x%y;
			x = y;
			y = r;
		}
		System.out.println(x);
	}

}
