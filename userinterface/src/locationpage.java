import javax.swing.*;
import java.awt.*;

public class locationpage extends JFrame {
	  private static ImageIcon map = new ImageIcon(new ImageIcon("src/map.png")
	    		.getImage().getScaledInstance(420,250, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon filterbtnIcon = new ImageIcon(new ImageIcon("src/filterbtn.png")
	    		.getImage().getScaledInstance(65,35, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon sortbtnIcon = new ImageIcon(new ImageIcon("src/sortbtn.png")
	    		.getImage().getScaledInstance(65,35, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon homeIcon = new ImageIcon(new ImageIcon("src/home.png")
	    		.getImage().getScaledInstance(30,25, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon idkIcon = new ImageIcon(new ImageIcon("src/idk.png")
	    		.getImage().getScaledInstance(35,30, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon listingsIcon = new ImageIcon(new ImageIcon("src/listings.png")
	    		.getImage().getScaledInstance(35,30, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon profileIcon = new ImageIcon(new ImageIcon("src/profile.png")
	    		.getImage().getScaledInstance(35,30, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon notifIcon = new ImageIcon(new ImageIcon("src/notifications.png")
	    		.getImage().getScaledInstance(35,30, Image.SCALE_SMOOTH));



	public locationpage() {
		setTitle("Location Page");
		   JPanel header = new JPanel(new BorderLayout());
		   JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		   JPanel footer = new JPanel(new GridLayout(0,5,0,0));
		   footer.setPreferredSize(new Dimension(420,100));
		   JButton jbtHome = new JButton("");
		   
		   jbtHome.setIcon(homeIcon);
	       jbtHome.setBorderPainted(false);
	       jbtHome.setOpaque(false);
	       jbtHome.setContentAreaFilled(true);
	       jbtHome.setFocusPainted(false);
	       
	       JButton jbtListings = new JButton("");
	       
		   jbtListings.setIcon(listingsIcon);
	       jbtListings.setBorderPainted(false);
	       jbtListings.setOpaque(false);
	       jbtListings.setContentAreaFilled(true);
	       jbtListings.setFocusPainted(false);
	       
	       JButton jbtIdk = new JButton("");
	       
		   jbtIdk.setIcon(idkIcon);
	       jbtIdk.setBorderPainted(false);
	       jbtIdk.setOpaque(false);
	       jbtIdk.setContentAreaFilled(true);
	       jbtIdk.setFocusPainted(false);
	       
	       JButton jbtNotif = new JButton("");
	       
		   jbtNotif.setIcon(notifIcon);
	       jbtNotif.setBorderPainted(false);
	       jbtNotif.setOpaque(false);
	       jbtNotif.setContentAreaFilled(true);
	       jbtNotif.setFocusPainted(false);
	       
	       JButton jbtProfile = new JButton("");
	       
		   jbtProfile.setIcon(profileIcon);
	       jbtProfile.setBorderPainted(false);
	       jbtProfile.setOpaque(false);
	       jbtProfile.setContentAreaFilled(true);
	       jbtProfile.setFocusPainted(false);
	       
	       footer.add(jbtHome);
	       footer.add(jbtListings);
	       footer.add(jbtIdk);
	       footer.add(jbtNotif);
	       footer.add(jbtProfile);
	
		
		   
		   JPanel headerNorth = new JPanel(new BorderLayout(0,0));
		   headerNorth.setBackground(Color.LIGHT_GRAY);
		   headerNorth.setPreferredSize(new Dimension(420,100));
		   JPanel headerNorthSouth = new JPanel(new BorderLayout(0,0));
		   headerNorthSouth.setPreferredSize(new Dimension(100,20));
		   headerNorthSouth.setOpaque(false);
		   
		   JButton jbtFilter = new JButton("");
		   JButton jbtSort = new JButton("");
		   
		   jbtFilter.setIcon(filterbtnIcon);
		   jbtFilter.setBorderPainted(false);
	       jbtFilter.setOpaque(true);
	       jbtFilter.setContentAreaFilled(true);
	       jbtFilter.setFocusPainted(false);
		   
	       jbtSort.setIcon(sortbtnIcon);
	       jbtSort.setBorderPainted(false);
	       jbtSort.setOpaque(true);
	       jbtSort.setContentAreaFilled(true);
	       jbtSort.setFocusPainted(false);
	       
	       
		   JPanel headerNorthEast = new JPanel(new BorderLayout());
		   headerNorthEast.setOpaque(false);
		   JPanel headerSouth = new JPanel (new FlowLayout(FlowLayout.LEFT));
		   headerSouth.setPreferredSize(new Dimension(420,50));
		   headerSouth.add(jbtFilter);
		   headerSouth.add(jbtSort);
		   
		   
		   JLabel locationArea = new JLabel("Bandar Sunway");
		   locationArea.setFont(new Font("Inter", Font.PLAIN, 20));
		   headerNorth.add(locationArea, BorderLayout.WEST);
		   
		   JLabel filterSlct = new JLabel ("Sep 12-15 : 1 room : 2 guests");
		   filterSlct.setFont(new Font("Inter", Font.PLAIN, 15));
		   filterSlct.setForeground(Color.gray);
		   
		   headerNorthSouth.add(filterSlct);
		   headerNorth.add(headerNorthSouth, BorderLayout.SOUTH);
		   headerNorth.add(headerNorthEast);
		   header.add(headerNorth, BorderLayout.NORTH);
		   header.add(headerSouth, BorderLayout.SOUTH);
		   content.add(new JLabel(map));
		   
		   
		   add(header, BorderLayout.NORTH);
		   add(content, BorderLayout.CENTER);
		   add(footer, BorderLayout.SOUTH);
		   setSize(450, 1000);
	       setResizable(false);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       setVisible(true);
		  
		  
		
	}
	
	public static void main(String [] args) {
		new locationpage();
	}
}