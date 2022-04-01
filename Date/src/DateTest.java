// 날짜를 나타내는 Date 클래스
public class DateTest {
	public static void main(String[] args) {
		Date D1 =new Date();
		Date D2 = new Date(2020);
		Date D3 = new Date(1900,"1월",1);
		System.out.println(D1);
		System.out.println(D2);
		System.out.println(D3);
	}
}
