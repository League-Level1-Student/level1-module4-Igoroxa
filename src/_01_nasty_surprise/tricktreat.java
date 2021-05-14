package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tricktreat implements ActionListener {
	JButton trick = new JButton("TRICK");
	JButton treat = new JButton("TREAT");
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	
	tricktreat() {
		
		frame.setVisible(true);
		frame.add(panel);
		
		panel.add(treat);
		panel.add(trick);
		
		frame.pack();
		
		
		trick.addActionListener(this);
		treat.addActionListener(this);
		
		
		
		
		
		
	}
	
public static void main(String[] args) {
	tricktreat t = new tricktreat();

	
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent arg0) {
frame.
	
	
}
}
