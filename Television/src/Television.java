// 객체 연습
// 접근자 생성자 추가
public class Television {
	private int channel; // 채널 번호
	private int volume; // 볼륨
	private boolean onOff; //전원상태
	
	Television(int c, int v, boolean o) { // 생성자
		channel = c;
		if(v > 0) {
			volume = v;
		}
		else
			volume = 0;
		onOff = o;
	}
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다. 화면켜짐은 "+onOff+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
