// �迭�� ��� ���ڿ� ���� ���� ���ڸ� ã�� ���α׷�
public class Lec2Ex6 {

	public static void main(String[] args) {
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		int min = s[0];
		for(int i=1; i<s.length; i++) {
			if(min > s[i])
				min = s[i];
		}
		System.out.println("�迭 s�� �ּڰ�: "+min);

	}

}
