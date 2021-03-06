package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterFactory;
import twitter4j.api.SearchResource;
import twitter4j.auth.AccessToken;
import twitter4j.auth.OAuthSupport;



public class Twitter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JTextField text = new JTextField();
JButton button = new JButton("Search Twitter");

Twitter() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(text);
	button.addActionListener(this);
	
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = (Twitter) new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
    ((OAuthSupport) twitter).setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
    ((OAuthSupport) twitter).setOAuthAccessToken(accessToken);

Query query = new Query(searchingFor);
    try {
        QueryResult result = ((SearchResource) twitter).search(query);
        return result.getTweets().get(0).getText();
    } catch (Exception e) {
        System.err.print(e.getMessage());
        return "What the heck is that?";
    }}

@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Tweet, Tweet!");
	String firstInput = text.getText();
	if (e.getSource() == button) {
		String latest = getLatestTweet(firstInput);
	}
	
	}
}

