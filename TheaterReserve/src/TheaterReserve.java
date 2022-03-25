//극장 예약 프로그램
import java.util.Scanner;

public class TheaterReserve {
	public static void main(String[] args) {
		int[] seat = new int[10];
		int n;
		Scanner s = new Scanner(System.in);
		
		for(int i=1; i<=seat.length; i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\n-  -  -  -  -  -  -  -  -  - ");
		
		for(int i=0; i<seat.length; i++) {
			System.out.print(seat[i]+"  ");
		}
		
		while(true) {
			System.out.println("\n\n원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			n = s.nextInt();
			if(n == -1) {
				System.out.println("예매를 종료합니다.");
				break;
			}
			else if (seat[n-1] !=0)
				System.out.println("이미 예약된 자리입니다.");
			else if(seat[n-1] == 0){
				seat[n-1]=1;
				System.out.println("예약되었습니다.\n");
				for(int i=1; i<=seat.length; i++) {
					System.out.print(i+"  ");
				}
				System.out.println("\n-  -  -  -  -  -  -  -  -  - ");
				
				for(int i=0; i<seat.length; i++) {
					System.out.print(seat[i]+"  ");
				}
				}
			}
			
		}
		
}
