//GUI 생성 실습(3)
import javax.swing.*;

public class MyFrame2 extends JFrame {
       public MyFrame2() {
             setSize(300, 200);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setTitle("MyFrame2");
             setVisible(true);
       }
       public static void main(String[] args) {
             MyFrame2 f = new MyFrame2();
       }
}