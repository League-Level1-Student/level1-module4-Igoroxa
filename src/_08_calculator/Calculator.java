package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton("Add");
	JButton sub = new JButton("Subtract");
	JButton div = new JButton("Multiply");
	JButton mul = new JButton("Multiply");
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	int x;
	int y;
	Calculator() {
	frame.setVisible(true);
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(add);
		panel.add(sub);
		panel.add(div);
		panel.add(mul);
		panel.add(label);
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		frame.pack();
		label.setVisible(true);
		
	}
	
		int addNumber(int x, int y) {
			return x+y;
		}
		int subtractNumber(int x, int y) {
			return x-y;
		}
		int divNumber(int x, int y) {
			return x/y;
		}
		int mulNumber(int x, int y) {
			return x*y;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		String firstInput = text1.getText();
		String secondInput = text2.getText();
		int i1 = Integer.parseInt(firstInput);
		int i2 = Integer.parseInt(secondInput);
		int result = 0;
		
		if (e.getSource() == add) {
			result = addNumber(i1,i2);
		}
		if (e.getSource() == sub) {
			result = subtractNumber(i1,i2);
		}
		if (e.getSource() == div) {
			result = divNumber(i1,i2);
		}
		if (e.getSource() == mul) {
			result = mulNumber(i1,i2);
		}
		label.setText(" " + result);
		
		frame.pack();
	}
	
}
