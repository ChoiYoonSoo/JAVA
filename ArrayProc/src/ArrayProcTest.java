// 배열에 저장된 값의 평균 구하기
public class ArrayProcTest {
	final static int students = 5;
	public static void main(String[] args) {
		int[] student=new int[students];
		ArrayProc s = new ArrayProc();
		s.getValues(student);
		System.out.println("평균은= "+s.getAverage(student));
		

	}

}
