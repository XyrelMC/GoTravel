import java.awt.*;
import javax.swing.*;
 
public class homepage extends JFrame {
	public homepage() {
		Color navy = new Color(27, 42, 91);
		Color grey = new Color(243, 243, 243);
		Color blue = new Color(0, 102, 204);
		Color green = new Color(30, 130, 76);
		Color lightGreen = new Color(225, 245, 232);
		
		JLabel jlblHello = new JLabel("Good morning, JY");
		jlblHello.setFont(new Font("SansSerif", Font.PLAIN, 18));
		JLabel jlblWhere = new JLabel("Where to next?");
		jlblWhere.setFont(new Font("SansSerif", Font.BOLD, 26));
		JPanel p1 = new JPanel(new GridLayout(3, 1));
		p1.setBackground(Color.WHITE);
		p1.add(jlblHello);
		p1.add(jlblWhere);
		p1.add(new JLabel("Discover your next adventure"));
		JPanel pHeader = new JPanel(new BorderLayout());
		pHeader.setBackground(Color.WHITE);
		pHeader.add(p1, BorderLayout.CENTER);
		pHeader.add(new JLabel(new ImageIcon("/src/img/JY.png")), BorderLayout.EAST);
		
		JTextField jtfSearch = new JTextField("  Search destinations or hotels");
		jtfSearch.setFont(new Font("SansSerif", Font.PLAIN, 16));
		jtfSearch.setBackground(grey);
		JButton jbtDate = new JButton("Sep 12 - 15  (3 nights)");
		jbtDate.setBackground(grey);
		JButton jbtGuests = new JButton("2 Guests  (1 room)");
		jbtGuests.setBackground(grey);
		JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 0));
		p2.setBackground(Color.WHITE);
		p2.add(jbtDate);
		p2.add(jbtGuests);
		JPanel pSearch = new JPanel(new GridLayout(2, 1, 5, 10));
		pSearch.setBackground(Color.WHITE);
		pSearch.add(jtfSearch);
		pSearch.add(p2);
		
		JPanel pTop = new JPanel(new BorderLayout(0, 10));
		pTop.setBackground(Color.WHITE);
		pTop.add(pHeader, BorderLayout.NORTH);
		pTop.add(pSearch, BorderLayout.CENTER);
		
		JLabel jlblPopular = new JLabel("Popular destinations");
		jlblPopular.setFont(new Font("SansSerif", Font.BOLD, 14));
		JLabel jlblAll = new JLabel("View all");
		jlblAll.setForeground(blue);
		JPanel p3 = new JPanel(new BorderLayout());
		p3.setBackground(Color.WHITE);
		p3.add(jlblPopular, BorderLayout.WEST);
		p3.add(jlblAll, BorderLayout.EAST);
 
		String[] places = {"/src/img/bali.png", "/src/img/tokyo", "/src/img/paris", "/src/img/santorini"};
		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
		p4.setBackground(Color.WHITE);
		for (int i = 0; i < 4; i++) {
			p4.add(new JLabel(new ImageIcon(places[i] + ".png")));
		}
		JPanel pPopular = new JPanel(new BorderLayout(0, 8));
		pPopular.setBackground(Color.WHITE);
		pPopular.add(p3, BorderLayout.NORTH);
		pPopular.add(p4, BorderLayout.CENTER);

		JLabel jlblRec = new JLabel("Recommended for you");
		jlblRec.setFont(new Font("SansSerif", Font.BOLD, 14));
		JLabel jlblDeals = new JLabel("See all deals");
		jlblDeals.setForeground(blue);
		JPanel p5 = new JPanel(new BorderLayout());
		p5.setBackground(Color.WHITE);
		p5.add(jlblRec, BorderLayout.WEST);
		p5.add(jlblDeals, BorderLayout.EAST);
 
		String[] photos = {"/src/img/AWSHotel", "/src/img/BWSHotel"};
		String[] names = {"Alila Wilderness Sanctuary", "Bayview Wilderness Sanctuary"};
		String[] ratings = {"9.4 Exceptional", "8.7 Very Good"};
		String[] places2 = {"Ubud, Bali  -  2.1 km from center", "San Francisco, USA  -  1.3 km"};
		String[] prices = {"RM240 / night", "RM199 / night"};
 
		JPanel p6 = new JPanel(new GridLayout(2, 1, 5, 10));
		p6.setBackground(Color.WHITE);
		for (int i = 0; i < 2; i++) {
			JLabel jlblName = new JLabel(names[i]);
			jlblName.setFont(new Font("SansSerif", Font.BOLD, 14));
			JLabel jlblTag1 = new JLabel(" Free breakfast ");
			jlblTag1.setOpaque(true);
			jlblTag1.setBackground(lightGreen);
			jlblTag1.setForeground(green);
			JLabel jlblTag2 = new JLabel(" Free cancellation ");
			jlblTag2.setOpaque(true);
			jlblTag2.setBackground(lightGreen);
			jlblTag2.setForeground(green);
			JPanel pTags = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 2));
			pTags.setBackground(Color.WHITE);
			pTags.add(jlblTag1);
			pTags.add(jlblTag2);
 
			JLabel jlblPrice = new JLabel(prices[i]);
			jlblPrice.setFont(new Font("SansSerif", Font.BOLD, 14));
			JButton jbtDeal = new JButton("View Deal");
			jbtDeal.setBackground(navy);
			jbtDeal.setForeground(Color.WHITE);
			JPanel pPrice = new JPanel(new BorderLayout());
			pPrice.setBackground(Color.WHITE);
			pPrice.add(jlblPrice, BorderLayout.WEST);
			pPrice.add(jbtDeal, BorderLayout.EAST);
 
			JPanel pInfo = new JPanel(new GridLayout(5, 1));
			pInfo.setBackground(Color.WHITE);
			pInfo.add(jlblName);
			pInfo.add(new JLabel(ratings[i]));
			pInfo.add(new JLabel(places2[i]));
			pInfo.add(pTags);
			pInfo.add(pPrice);
 
			JPanel pCard = new JPanel(new BorderLayout(10, 0));
			pCard.setBackground(Color.WHITE);
			pCard.add(new JLabel(new ImageIcon(photos[i] + ".png")), BorderLayout.WEST);
			pCard.add(pInfo, BorderLayout.CENTER);
			p6.add(pCard);
		}
		JPanel pRecommend = new JPanel(new BorderLayout(0, 8));
		pRecommend.setBackground(Color.WHITE);
		pRecommend.add(p5, BorderLayout.NORTH);
		pRecommend.add(p6, BorderLayout.CENTER);

		JPanel pMiddle = new JPanel(new BorderLayout(0, 15));
		pMiddle.setBackground(Color.WHITE);
		pMiddle.add(pPopular, BorderLayout.NORTH);
		pMiddle.add(pRecommend, BorderLayout.CENTER);
 
		JPanel pInner = new JPanel(new BorderLayout(0, 15));
		pInner.setBackground(Color.WHITE);
		pInner.add(pTop, BorderLayout.NORTH);
		pInner.add(pMiddle, BorderLayout.CENTER);
 
		JPanel pMain = new JPanel(new BorderLayout(10, 10));
		pMain.setBackground(Color.WHITE);
		pMain.add(pInner, BorderLayout.CENTER);
		pMain.add(new JLabel("  "), BorderLayout.WEST);
		pMain.add(new JLabel("  "), BorderLayout.EAST);
		add(pMain);
	}
 
	public static void main(String[] args) {
		homepage frame = new homepage();
		frame.setTitle("GoTravel - Home");
		frame.setSize(450, 1000);
		frame.setResizable(false);

		frame.setSize(400, 780);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

