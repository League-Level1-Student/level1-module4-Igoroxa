package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
	JFrame frame = new JFrame("Chuckle Clicker");
	JPanel panel = new JPanel();
	
public static void main(String[] args) {
	chuckleclicker c = new chuckleclicker();
	c.makeButton();
}
void makeButton() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
	joke.setVisible(true);
	punchline.setVisible(true);
	frame.pack();
	joke.addActionListener(this);
	punchline.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent event) {
	if(event.getSource() == joke) {
JOptionPane.showMessageDialog(null, "Where do you go from red to green? Answer: In a watermelon");
	}
	if (event.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "Where do sharks live? Answer: Finland");
	}
}
}
