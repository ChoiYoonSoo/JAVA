// ��ü ����
// ������ ������ �߰�
public class Television {
	private int channel; // ä�� ��ȣ
	private int volume; // ����
	private boolean onOff; //��������
	
	Television(int c, int v, boolean o) { // ������
		channel = c;
		if(v > 0) {
			volume = v;
		}
		else
			volume = 0;
		onOff = o;
	}
	void print() {
		System.out.println("ä���� "+channel+"�̰� ������ "+volume+"�Դϴ�. ȭ�������� "+onOff+"�Դϴ�.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
