// �迭�� ����� ���� ��� ���ϱ�
public class ArrayProcTest {
	final static int students = 5;
	public static void main(String[] args) {
		int[] student=new int[students];
		ArrayProc s = new ArrayProc();
		s.getValues(student);
		System.out.println("�����= "+s.getAverage(student));
		

	}

}
