import java.util.Arrays;

public class �迭Ŭ���� {
	public static void main(String[] args) {
		int [] list = new int[5];
		list[0] = 10;
		list[1] = 30;
		list[2] = 50;
		list[3] = 60;
		list[4] = 20;
		
		int [] list_copy = Arrays.copyOf(list, list.length); // �迭�� ��� ���� �ٸ� �迭�� �����ϱ�
		Arrays.sort(list_copy); // �迭�� ����� ���ڸ� ũ������� ����
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list_copy[i]);
		}
	}
}
