// �Է¹��� URL�� www.�� �����ϴ��� Ȯ���ϴ� ���α׷�
import java.util.*;
public class StringTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		while(true) {
			
			System.out.print("���ڿ��� �Է��ϼ���>");
			str=scan.nextLine();
			String s1 = str.substring(0,4);
			
			if(str.equals("quit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;		
			}
			else if(s1.equals("www."))
				System.out.println(str+"�� 'www'�� �����մϴ�.");
			else
				System.out.println(str+"�� 'www'�� �������� �ʽ��ϴ�.");
		
		}
	}
}
