// �ð��� ��Ÿ���� TimeŬ���� �ۼ��ϱ�
public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(13,27,46);
		Time t3 = new Time(99,99,99);
		
		System.out.println("�⺻ ������ ȣ�� �� �ð�: "+t1.toString());
		System.out.println("�ι�° ������ ȣǮ �� �ð�: "+t2.toString());
		System.out.println("�ùٸ��� ���� �ð� ���� �� �ð�: "+t3.toString());

	}

}
