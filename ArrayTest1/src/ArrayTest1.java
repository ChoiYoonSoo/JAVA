// �迭�� ���� ������������ �����Ͽ� ���
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] s = new int[10];
		for(int i=9; i>=0; i--) {
			s[i]=i;
		}
		
		for(int i=9; i>=0; i--) {
			System.out.print(s[i]+" ");
		}
	}

}