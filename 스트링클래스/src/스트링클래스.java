import java.util.*;

public class 스트링클래스 {

	public static void main(String[] args) {
		String s = "Hello world";
		String c = "Hello world";
		
		System.out.println(s.charAt(1)); // 지정된 인덱스에 있는 문자 반환
		System.out.println(s.compareTo(c)); // 문자열 비교 앞에있으면 -1, 같으명 0, 뒤에있으면 1 반환
		System.out.println(s.concat(" Hi")); // 주어진 문자열을 현재의 문자열 뒤에 붙힌다
		System.out.println(s.equals("Hello world")); // 주어진 객체와 현재의 문자열을 비교한다
		System.out.println(s.equalsIgnoreCase("hello WORLs")); // 대소문자를 무시하고 비교한다
		System.out.println(s.isEmpty()); // length()가 0이면 true를 반환한다
		System.out.println(s.length()); // 현재 문자열의 길이를 반환한다
		System.out.println(s.substring(1,4)); // 부분 문자열 추출
		System.out.println(s.toUpperCase()); // 대문자로 변환
		System.out.println(s.replace('H','x')); // 문자 교환
		
		int i = Integer.parseInt("123"); // 변수 i에 정수 123이 저장된다
		double d = Double.parseDouble("3.1415"); // 변수 d에 실수 3.1415가 저장된다.
		
	}

}