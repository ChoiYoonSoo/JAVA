// GUI 생성 실습(1)
import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		
		f.setSize(300,200); // 박스 가로,세로 크기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
