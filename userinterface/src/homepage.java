import java.awt.*;
import javax.swing.*;
import javax.swing.*;

public class homepage extends JFrame {
	public homepage() {
		// Set BorderLayout with horizontal gap 5 and vertical gap 10
		setLayout(new BoxLayout(frame, BoxLayout.PAGE_AXIS));
		add(new JLabel("Create an account"), BorderLayout.CENTER);
		add(new JLabel("Enter your email to sign up for this app"), BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args){
		homepage frame = new homepage();
		frame.setTitle("Border Layout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

