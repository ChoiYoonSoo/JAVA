import java.util.*;

public class ��Ʈ��Ŭ���� {

	public static void main(String[] args) {
		String s = "Hello world";
		String c = "Hello world";
		
		System.out.println(s.charAt(1)); // ������ �ε����� �ִ� ���� ��ȯ
		System.out.println(s.compareTo(c)); // ���ڿ� �� �տ������� -1, ������ 0, �ڿ������� 1 ��ȯ
		System.out.println(s.concat(" Hi")); // �־��� ���ڿ��� ������ ���ڿ� �ڿ� ������
		System.out.println(s.equals("Hello world")); // �־��� ��ü�� ������ ���ڿ��� ���Ѵ�
		System.out.println(s.equalsIgnoreCase("hello WORLs")); // ��ҹ��ڸ� �����ϰ� ���Ѵ�
		System.out.println(s.isEmpty()); // length()�� 0�̸� true�� ��ȯ�Ѵ�
		System.out.println(s.length()); // ���� ���ڿ��� ���̸� ��ȯ�Ѵ�
		System.out.println(s.substring(1,4)); // �κ� ���ڿ� ����
		System.out.println(s.toUpperCase()); // �빮�ڷ� ��ȯ
		System.out.println(s.replace('H','x')); // ���� ��ȯ
		
		int i = Integer.parseInt("123"); // ���� i�� ���� 123�� ����ȴ�
		double d = Double.parseDouble("3.1415"); // ���� d�� �Ǽ� 3.1415�� ����ȴ�.
		
	}

}