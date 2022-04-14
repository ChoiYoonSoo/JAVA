import java.util.Arrays;

public class 배열클래스 {
	public static void main(String[] args) {
		int [] list = new int[5];
		list[0] = 10;
		list[1] = 30;
		list[2] = 50;
		list[3] = 60;
		list[4] = 20;
		
		int [] list_copy = Arrays.copyOf(list, list.length); // 배열의 모든 값을 다른 배열로 복사하기
		Arrays.sort(list_copy); // 배열에 저장된 숫자를 크기순으로 정렬
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list_copy[i]);
		}
	}
}
