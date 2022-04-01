//여러개의 객체 생성
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television(7,15,true);
		/*myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print(); //Television클래스 안에 있는 메소드 안의 print 출력
		int ch = myTv.getChannel(); // 메소드를 이용한 채널 출력
		System.out.println("현재 채널은 "+ch+"입니다");*/
		
		Television yourTv = new Television(7,11,false);
		/*yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		//yourTv.print(); //메소드 출력
		
		myTv.setChannel(11); // 채널 값 바꾸는 메소드
		System.out.println("바뀐 채널은 "+myTv.channel+"입니다.");*/
		myTv.print();
		yourTv.print();
		
		//System.out.println("나의 텔레비전의 채널은 "+myTv.channel+"이고 볼륨은 "+myTv.volume+"입니다.");
		//System.out.println("너의 텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volume+"입니다.");


	}

}
