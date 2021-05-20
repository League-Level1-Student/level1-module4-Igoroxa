package _04_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class chuckleclicker {
public static void main(String[] args) {
	chuckleclicker c = new chuckleclicker();
	c.makeButton();
}
void makeButton() {
	JOptionPane.showMessageDialog(null, "Make BUTTONS");
	JFrame frame = new JFrame();
	frame.setVisible(true);
}
}
