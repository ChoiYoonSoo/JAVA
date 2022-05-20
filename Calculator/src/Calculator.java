//계산기 간단한 계산 가능
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { 
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",
	};


	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel(); 
		tField.setEnabled(false);
		tField.setDisabledTextColor(Color.black); // 텍스트 색상 검정
		panel.setLayout(new GridLayout(0, 5, 3, 3)); 
		buttons = new JButton[25];
		int index = 0;
		
		for (int rows = 0; rows < 5; rows++) { 
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red); 
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				buttons[index].addActionListener(this);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("최윤수의 계산기");
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		float[] num = new float[3];
		float result= 0;
		int idx=0;
		
		String actionCommand = e.getActionCommand();
		tField.setText(tField.getText() + actionCommand);
		
		if(actionCommand == "=") {
			String str = tField.getText();
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) <= '9' && str.charAt(i) >= '0') {
					num[idx] = str.charAt(i)-'0';
					idx++;
				}
			}
			
			switch(str.charAt(1)) {
			case '+':{
				result = num[0] + num[1];
				break;
			}
			case '-':{
				result = num[0] - num[1];
				break;
			}
			case 'x':{
				result = num[0] * num[1];
				break;
			}
			case '/':{
				result = num[0] / num[1];
				break;
			}
			case '%':{
				result = num[0] % num[1];
				break;
			}
			}
			tField.setText(tField.getText() + result);
		}
		
	}
	

	public static void main(String args[]) {
		Calculator s = new Calculator();
	}
}