import javax.swing.*;
import java.awt.*;
public class HotelInfo extends JFrame {



	private static ImageIcon usIcon = new ImageIcon(new ImageIcon("/Users/xyrelium/Downloads/x45-copy-web.jpg.pagespeed.ic.vEQDx7GsVj.jpg").getImage().getScaledInstance(450, 250, Image.SCALE_DEFAULT));; 



	
	public HotelInfo() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));

		add(new JLabel(usIcon));
	
	}
		/**Main method */
	public static void main(String[] args) {
		
		
		HotelInfo frame = new HotelInfo();
		
	
		frame.setTitle("About Hotel");
		frame.pack();
		frame.setSize(450, 800);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Alila Wilderness Sanctuary & Spa");
		label.setFont(new Font("Poppins", Font.PLAIN, 25));
		JLabel location = new JLabel("Bali, Indonesia");
		location.setFont(new Font("Poppins", Font.PLAIN, 15));
		panel.add(label);
		panel.setVisible(true);
		location.setVisible(true);
		panel.add(location);
		frame.add(panel);
		frame.setVisible(true);
	
	}
}