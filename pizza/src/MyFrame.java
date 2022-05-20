// 피자 주문화면 작성하기 및 배경변경
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

	public MyFrame() {
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();

		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		panelA.setBackground(Color.BLUE);

		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");

		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);

		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		panelB.setBackground(Color.RED);

		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		panel.setBackground(Color.GREEN);
		setVisible(true);

	}
}