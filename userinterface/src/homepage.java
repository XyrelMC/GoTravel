import java.awt.*;
import javax.swing.*;
 
public class homepage extends JFrame {
	public homepage() {
		setLayout(new BorderLayout(5, 10));
 
		JPanel p1 = new JPanel(new GridLayout(3, 1));
		JLabel jlblWhere = new JLabel("Where to next?");
		jlblWhere.setFont(new Font("SansSerif", Font.BOLD, 24));
		p1.add(new JLabel("Good morning, JY"));
		p1.add(jlblWhere);
		p1.add(new JLabel("Discover your next adventure"));

		JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
		p2.add(new JButton("Sep 12 - 15 (3 nights)"));
		p2.add(new JButton("2 Guests (1 room)"));
 
		JPanel p3 = new JPanel(new GridLayout(2, 1, 5, 5));
		p3.add(new JTextField("Search destinations or hotels"));
		p3.add(p2);
 
		JPanel pTop = new JPanel(new BorderLayout(5, 10));
		pTop.add(p1, BorderLayout.NORTH);
		pTop.add(p3, BorderLayout.CENTER);
//add photos
		String[] places = {"Bali", "Tokyo", "Paris", "Santorini"};
		JPanel p4 = new JPanel(new GridLayout(1, 4, 5, 5));
		for (int i = 0; i < 4; i++) {
			p4.add(new JButton(places[i]));
		}
		JPanel pPopular = new JPanel(new BorderLayout(5, 5));
		pPopular.add(new JLabel("Popular destinations"), BorderLayout.NORTH);
		pPopular.add(p4, BorderLayout.CENTER);

		String[] names = {"Alila Wilderness Sanctuary", "Bayview Wilderness Sanctuary"};
		String[] ratings = {"9.4 Exceptional - Ubud, Bali", "8.7 Very Good - San Francisco"};
		String[] prices = {"RM240 / night", "RM199 / night"};
 
		JPanel p5 = new JPanel(new GridLayout(2, 1, 5, 10));
		for (int i = 0; i < 2; i++) {
			JPanel pInfo = new JPanel(new GridLayout(3, 1));
			pInfo.add(new JLabel(names[i]));
			pInfo.add(new JLabel(ratings[i]));
			pInfo.add(new JLabel(prices[i]));
 
			JButton jbtDeal = new JButton("View Deal");
			jbtDeal.setBackground(new Color(27, 42, 91));
			jbtDeal.setForeground(Color.WHITE);
//add photo
			JPanel pCard = new JPanel(new BorderLayout(5, 5));
			pCard.add(new JButton("Photo"), BorderLayout.WEST);
			pCard.add(pInfo, BorderLayout.CENTER);
			pCard.add(jbtDeal, BorderLayout.EAST);
			p5.add(pCard);
		}
		JPanel pRecommend = new JPanel(new BorderLayout(5, 5));
		pRecommend.add(new JLabel("Recommended for you"), BorderLayout.NORTH);
		pRecommend.add(p5, BorderLayout.CENTER);
 
		JPanel pMiddle = new JPanel(new BorderLayout(5, 10));
		pMiddle.add(pPopular, BorderLayout.NORTH);
		pMiddle.add(pRecommend, BorderLayout.CENTER);
 
		add(pTop, BorderLayout.NORTH);
		add(pMiddle, BorderLayout.CENTER);
	}
 
	public static void main(String[] args) {
		homepage frame = new homepage();
		frame.setTitle("StayDirect - Home");
		frame.setSize(400, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

