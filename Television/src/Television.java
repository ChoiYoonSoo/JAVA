//��ü ����
public class Television {
	int channel; // ä�� ��ȣ
	int volume; // ����
	boolean onOff; //��������
	//�޼ҵ�
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
