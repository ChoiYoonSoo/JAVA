// 실행 오류를 발생하지 않는 안전한 배열 만드는 프로그램
public class SafeArrayTest {

	public static void main(String[] args) {
		SafeArray array = new SafeArray(3);
		
		for(int i=0; i<(array.length+1); i++) {
			array.put(i,i*10);
		}

	}

}
