import javax.swing.*;
import java.awt.*;

public class locationpage extends JFrame {
	  private static ImageIcon map = new ImageIcon(new ImageIcon("src/map.png")
	    		.getImage().getScaledInstance(420,300, Image.SCALE_SMOOTH));
	  
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
	  
	  private static ImageIcon hotelpicIcon = new ImageIcon(new ImageIcon("src/hotelpicture.png")
	    		.getImage().getScaledInstance(420,150, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon barIcon = new ImageIcon(new ImageIcon("src/bar2.png")
	    		.getImage().getScaledInstance(40,3, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon selectIcon = new ImageIcon(new ImageIcon("src/select.png")
	    		.getImage().getScaledInstance(80,35, Image.SCALE_SMOOTH));
	  
	  private static ImageIcon pngHeaderIcon = new ImageIcon(new ImageIcon("src/pngheaderlmfao.png")
	    		.getImage().getScaledInstance(420,80, Image.SCALE_SMOOTH));



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
		  // headerNorth.setBackground(Color.LIGHT_GRAY);
		   headerNorth.setBackground(Color.WHITE);
		   headerNorth.setPreferredSize(new Dimension(420, 95));   // was 80
		   headerNorth.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0)); 
		   JPanel headerNorthSouth = new JPanel(new BorderLayout(0,0));
		   headerNorthSouth.setPreferredSize(new Dimension(100,20));
		   headerNorthSouth.setOpaque(false);
		   
		   JButton jbtFilter = new JButton("");
		   JButton jbtSort = new JButton("");
		   
		   jbtFilter.setIcon(filterbtnIcon);
		   jbtFilter.setBorderPainted(false);
	       jbtFilter.setOpaque(false);
	       jbtFilter.setContentAreaFilled(true);
	       jbtFilter.setFocusPainted(false);
		   
	       jbtSort.setIcon(sortbtnIcon);
	       jbtSort.setBorderPainted(false);
	       jbtSort.setOpaque(false);
	       jbtSort.setContentAreaFilled(true);
	       jbtSort.setFocusPainted(false);
	       
	       
		   JPanel headerNorthEast = new JPanel(new FlowLayout());
		   headerNorthEast.setOpaque(false);
		   JPanel headerSouth = new JPanel (new FlowLayout(FlowLayout.LEFT));
		   headerSouth.setPreferredSize(new Dimension(420,50));
		   headerSouth.add(jbtFilter);
		   headerSouth.add(jbtSort);
		   
		   
		   JLabel locationArea = new JLabel("");
		   locationArea.setIcon(pngHeaderIcon);
		   locationArea.setHorizontalAlignment(SwingConstants.CENTER);
		   headerNorth.add(locationArea);
		   
		   //JLabel filterSlct = new JLabel ("Sep 12-15 : 1 room : 2 guests");
		   //filterSlct.setFont(new Font("Inter", Font.PLAIN, 15));
		  // filterSlct.setForeground(Color.gray);
		   
		 //  headerNorthSouth.add(filterSlct);
		   headerSouth.setBackground(Color.white);
		  // headerNorth.add(headerNorthSouth, BorderLayout.SOUTH);
		  // headerNorth.add(headerNorthEast);
		   
		   header.add(headerNorth, BorderLayout.NORTH);
		   header.add(headerSouth, BorderLayout.SOUTH);
		   content.add(new JLabel(map));
		   
		   content.setBackground(Color.white);
		   footer.setBackground(Color.white);
		   
        JPanel roombooking = new JPanel(new BorderLayout());
        roombooking.setBackground(new Color(255, 255, 255));
        roombooking.setPreferredSize(new Dimension(420,250));
        roombooking.add(new JLabel(hotelpicIcon),BorderLayout.NORTH);
        JPanel roomdesc = new JPanel(new BorderLayout());
        JLabel roomname = new JLabel("Location name");
        roomdesc.setBackground(new Color(255, 255, 255));
        // roomdesc.setPreferredSize(new Dimension(320,250));
        roomname.setFont(new Font("Inter", Font.BOLD, 17));
        JLabel roomcont = new JLabel("500 Reviews");
        roomcont.setForeground(Color.LIGHT_GRAY);
        roomcont.setFont(new Font("Inter", Font.PLAIN, 15));
        JPanel roomprice = new JPanel(new BorderLayout());
        JLabel roomdollar = new JLabel ("RM 123");
        roomdollar.setFont(new Font("Inter", Font.PLAIN, 20));
        JLabel nightly = new JLabel ("/ night");
        nightly.setFont(new Font("Inter", Font.PLAIN, 15));
        nightly.setForeground(Color.gray);
        
        roomprice.setBackground(Color.white);
        
        JButton jbtSelect = new JButton("");
        jbtSelect.setIcon(selectIcon);
        jbtSelect.setBorderPainted(false);
	    jbtSelect.setOpaque(false);
	    jbtSelect.setContentAreaFilled(true);
	    jbtSelect.setFocusPainted(false);
        
        roomprice.add(roomdollar, BorderLayout.WEST);
        roomprice.add(nightly, BorderLayout.CENTER);
        roomprice.add(jbtSelect, BorderLayout.EAST);
        
     
        roomdesc.add(roomname, BorderLayout.NORTH);
        roomdesc.add(roomcont, BorderLayout.CENTER);
        roomdesc.add(roomprice, BorderLayout.SOUTH);
        roombooking.add(roomdesc);
        
        JPanel roombooking2 = new JPanel(new BorderLayout());
        roombooking2.setBackground(new Color(255, 255, 255));
        roombooking2.setPreferredSize(new Dimension(420,250));
        roombooking2.add(new JLabel(hotelpicIcon),BorderLayout.NORTH);
        JPanel roomdesc2 = new JPanel(new BorderLayout());
        JLabel roomname2 = new JLabel("Location name");
        roomdesc2.setBackground(new Color(255, 255, 255));
        // roomdesc.setPreferredSize(new Dimension(320,250));
        roomname2.setFont(new Font("Inter", Font.BOLD, 17));
        JLabel roomcont2 = new JLabel("500 Reviews");
        roomcont2.setForeground(Color.LIGHT_GRAY);
        roomcont2.setFont(new Font("Inter", Font.PLAIN, 15));
        JPanel roomprice2 = new JPanel(new BorderLayout());
        JLabel roomdollar2 = new JLabel ("RM 123");
        roomdollar2.setFont(new Font("Inter", Font.PLAIN, 20));
        JLabel nightly2 = new JLabel ("/ night");
        nightly2.setFont(new Font("Inter", Font.PLAIN, 15));
        nightly2.setForeground(Color.gray);
        
        roomprice2.setBackground(Color.white);
        
        JButton jbtSelect2 = new JButton("");
        jbtSelect2.setIcon(selectIcon);
        jbtSelect2.setBorderPainted(false);
	    jbtSelect2.setOpaque(false);
	    jbtSelect2.setContentAreaFilled(true);
	    jbtSelect2.setFocusPainted(false);
        
        roomprice2.add(roomdollar2, BorderLayout.WEST);
        roomprice2.add(nightly2, BorderLayout.CENTER);
        roomprice2.add(jbtSelect2, BorderLayout.EAST);
        
     
        roomdesc2.add(roomname2, BorderLayout.NORTH);
        roomdesc2.add(roomcont2, BorderLayout.CENTER);
        roomdesc2.add(roomprice2, BorderLayout.SOUTH);
        roombooking2.add(roomdesc2);
        
        JPanel barPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel barLabel = new JLabel("");
        barPanel.setBackground(Color.white);
        barLabel.setIcon(barIcon);
        barPanel.add(barLabel);
        
        content.add(barPanel);
        content.add(roombooking);
        content.add(roombooking2);
        content.setPreferredSize(new Dimension(450, 1000));
        
        
		   
		   add(header, BorderLayout.NORTH);
		   add(content, BorderLayout.CENTER);
		   add(footer, BorderLayout.SOUTH);
		   JScrollPane scrollPane = new JScrollPane(content,
	                JScrollPane.VERTICAL_SCROLLBAR_NEVER,
	                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	        add(scrollPane, BorderLayout.CENTER);
		   setSize(450, 1000);
	       setResizable(false);
	       setLocationRelativeTo(null);
	       setBackground(Color.white);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       setVisible(true);
		  
		  
		
	}
	
	public static void main(String [] args) {
		new locationpage();
	}
}