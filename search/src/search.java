// ����Ž�� ���α׷�
import java.util.*;
public class search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s[] = {0,11,18,29,35,49,62,68,73,88,100};
		int n;
		int idx = 0;
		int max=0,min=0;
		System.out.print("���� �� �Է�: ");
		n = input.nextInt();
		
		for(int i=0; i<s.length; i++) {
			
			if(n == s[i]) {
				idx = i+1;
				System.out.println(n+"�� "+idx+"��°�� �ֽ��ϴ�.");
			}
			else if(n > s[i])
				min = s[i];
			else if (n < s[i]) {
				max = s[i];
				break;
			}		
		}
		
		if(n < s[0]) { // �迭�� ù��°������ n�� ������ ���
			System.out.println(n+"��(��) "+max+"���� �۽��ϴ�.");
		}
		else if(n > s[10]) { // �迭�� ��������° ������ n�� Ŭ�� ���
			System.out.println(n+"��(��) "+min+"���� Ů�ϴ�.");
		}
		else // �迭 ���̿� ���� ������� ���
			System.out.println(n+"��(��) "+min+"���� ũ�� " +max+ "���� �۽��ϴ�.");
		
	}

}
