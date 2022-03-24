// 입력받은 URL이 www.로 시작하는지 확인하는 프로그램
import java.util.*;
public class StringTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		while(true) {
			
			System.out.print("문자열을 입력하세요>");
			str=scan.nextLine();
			String s1 = str.substring(0,4);
			
			if(str.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;		
			}
			else if(s1.equals("www."))
				System.out.println(str+"은 'www'로 시작합니다.");
			else
				System.out.println(str+"은 'www'로 시작하지 않습니다.");
		
		}
	}
}
