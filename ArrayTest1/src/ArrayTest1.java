// 배열의 값을 내림차순으로 저장하여 출력
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
