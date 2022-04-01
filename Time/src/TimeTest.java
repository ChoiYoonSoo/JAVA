// 시간을 나타내는 Time클래스 작성하기
public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(13,27,46);
		Time t3 = new Time(99,99,99);
		
		System.out.println("기본 생성자 호출 후 시간: "+t1.toString());
		System.out.println("두번째 생성자 호풀 후 시간: "+t2.toString());
		System.out.println("올바르지 않은 시간 설정 후 시간: "+t3.toString());

	}

}
