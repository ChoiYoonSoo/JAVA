// GUI ���� �ǽ�(1)
import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		
		f.setSize(300,200); // �ڽ� ����,���� ũ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}