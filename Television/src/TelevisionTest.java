//�������� ��ü ����
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television(7,15,true);
		/*myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print(); //TelevisionŬ���� �ȿ� �ִ� �޼ҵ� ���� print ���
		int ch = myTv.getChannel(); // �޼ҵ带 �̿��� ä�� ���
		System.out.println("���� ä���� "+ch+"�Դϴ�");*/
		
		Television yourTv = new Television(7,11,false);
		/*yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		//yourTv.print(); //�޼ҵ� ���
		
		myTv.setChannel(11); // ä�� �� �ٲٴ� �޼ҵ�
		System.out.println("�ٲ� ä���� "+myTv.channel+"�Դϴ�.");*/
		myTv.print();
		yourTv.print();
		
		//System.out.println("���� �ڷ������� ä���� "+myTv.channel+"�̰� ������ "+myTv.volume+"�Դϴ�.");
		//System.out.println("���� �ڷ������� ä���� "+yourTv.channel+"�̰� ������ "+yourTv.volume+"�Դϴ�.");


	}

}
