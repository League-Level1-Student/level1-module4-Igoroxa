package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
JFrame frame = new JFrame("SlotMachine");
JPanel panel = new JPanel();
JButton button = new JButton("SPIN");
JLabel label1; 
JLabel label2;
JLabel label3;
JLabel lime;
JLabel cherry;
JLabel orange;
Random ran = new Random();

slotMachine() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	button.setVisible(true);
	try {
		cherry = createLabelImage("Cherry.jpeg");
		lime = createLabelImage("lime.png");
		orange = createLabelImage("Orange.png");
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	label1 = cherry;
	label2 = lime;
	label3 = orange;
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
	
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}


@Override
public void actionPerformed(ActionEvent e) {
	int x = ran.nextInt(3)+1;
	int y = ran.nextInt(3)+1;
	int z = ran.nextInt(3)+1;
	try {
	if (x == 1) {
		
			label1 = createLabelImage("Cherry.jpeg");
		
	}
	if (x == 2) {
		label1 = createLabelImage("lime.png");
	}
	if (x == 3) {
		label1 = createLabelImage("Orange.png");
	}
	
	if (y == 1) {
		label2 = createLabelImage("Cherry.jpeg");
	}
	if (y == 2) {
		label2 = createLabelImage("lime.png");
	}
	if (y == 3) {
		label2 = createLabelImage("Orange.png");
	}
	
	if (z == 1) {
		label3 = createLabelImage("Cherry.jpeg");
	}
	if (z == 2) {
		label3 = createLabelImage("lime.png");
	}
	if (z == 3) {
		label3 = createLabelImage("Orange.png");
	}
	
	} catch (MalformedURLException e1) {
		
		e1.printStackTrace();
	}
	
	panel.removeAll();
	panel.add(button);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	
	frame.pack();
	if (x == y && x == z) {
		JOptionPane.showMessageDialog(null, "You WON!");
	}
}
}
