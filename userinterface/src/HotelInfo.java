import javax.swing.*;
import java.awt.*;

public class HotelInfo extends JFrame {

    private static ImageIcon usIcon = new ImageIcon(
        new ImageIcon("src/x45-copy-web.jpg.pagespeed.ic.vEQDx7GsVj.jpg")
            .getImage().getScaledInstance(450, 250, Image.SCALE_SMOOTH));
    
    private static ImageIcon reviewIcon = new ImageIcon(new ImageIcon("src/ninepointfour.png")
    		.getImage().getScaledInstance(50,30, Image.SCALE_SMOOTH));
    
    private static ImageIcon galleryIcon = new ImageIcon(new ImageIcon("src/gallery.png")
    		.getImage().getScaledInstance(450,100, Image.SCALE_SMOOTH));
    
    private static ImageIcon wifiIcon = new ImageIcon(new ImageIcon("src/wifi.png")
    		.getImage().getScaledInstance(25,20, Image.SCALE_SMOOTH));
    
    private static ImageIcon circlex = new ImageIcon(new ImageIcon("src/circlex.png")
    		.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    
    private static ImageIcon gymIcon = new ImageIcon(new ImageIcon("src/gym.png")
    		.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    
    private static ImageIcon parkingIcon = new ImageIcon(new ImageIcon("src/parking.png")
    		.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    
    private static ImageIcon restaurantIcon = new ImageIcon(new ImageIcon("src/restaurant.png")
    		.getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    
    private static ImageIcon roomIcon = new ImageIcon(new ImageIcon("src/room.png")
    		.getImage().getScaledInstance(420,150, Image.SCALE_SMOOTH));
    
    private static ImageIcon bookIcon = new ImageIcon(new ImageIcon("src/booknow.png")
    		.getImage().getScaledInstance(135,45, Image.SCALE_SMOOTH));
    
    private static ImageIcon callIcon = new ImageIcon(new ImageIcon("src/callhotel.png")
    		.getImage().getScaledInstance(135,45, Image.SCALE_SMOOTH));
    

    

    

    public HotelInfo() {
        setTitle("About Hotel");

        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        content.add(new JLabel(usIcon));
        content.setBackground(new Color(242, 242, 247));

        JPanel panel = new JPanel(new GridLayout(3,1,0,-20));
        panel.setPreferredSize(new Dimension(400, 90));
        panel.setBackground(new Color(242, 242, 247));


        JLabel name = new JLabel("Alila Wilderness Sanctuary & Spa");
        name.setFont(new Font("Inter", Font.BOLD, 20));
        
        JLabel location = new JLabel("Bali, Indonesia");
        location.setFont(new Font("Inter", Font.PLAIN, 15));
        JLabel desc = new JLabel("Descriptino descriptin description description");
        desc.setFont(new Font("Inter", Font.PLAIN, 12));
        
        JLabel revlabel = new JLabel("Exceptional     |");
        revlabel.setFont(new Font("Inter", Font.BOLD, 15));
        
        JLabel blank = new JLabel("    ");
        
        JLabel revlabel2 = new JLabel("       Uhud Center");
        revlabel2.setFont(new Font("Inter", Font.PLAIN, 15));
       

        JPanel review = new JPanel(new GridLayout(0,4,-30,0));
        review.setPreferredSize(new Dimension(420,80));
        review.setBackground(new Color(255,255,255));
        review.add(new JLabel(reviewIcon));
        review.add(revlabel);
        review.add(blank);
        review.add(revlabel2);
        
        JPanel gallery = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        gallery.setPreferredSize(new Dimension(420,175));
        gallery.setBackground(new Color(242, 242, 247));
        
        JLabel lblgallery = new JLabel ("Photo Gallery");
        lblgallery.setFont(new Font("Inter", Font.PLAIN, 17));
        gallery.add(lblgallery);
        gallery.add(new JLabel(galleryIcon));
        
        JPanel description = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        description.setBackground(new Color(242, 242, 247));
        description.setPreferredSize(new Dimension(420,175));
        description.setAutoscrolls(true);
        JLabel title = new JLabel ("About Alila Wilderness");
        title.setFont(new Font("Inter", Font.BOLD, 20));
        JLabel descriptor = new JLabel("<html><body style='width: 300px'>" + "Nestled on the edge of a lush tropical valley, Alila Wilderness Sanctuary delivers an unparalleled immersion into Balinese culture and natural beauty. Unwind in spacious private villas featuring infinity plunge pools, outdoor showers, and bespoke wellness treatments designed by world-renowned spiritual practitioners..." + "</body></html>");
        JButton readmore = new JButton("Read More");
        readmore.setForeground(new Color(194, 94, 59));
        readmore.setFont(new Font("Inter", Font.BOLD, 13));
        readmore.setBorderPainted(false);
        readmore.setOpaque(false);
        readmore.setContentAreaFilled(false);
        readmore.setFocusPainted(false);
        
        description.add(title);
        description.add(descriptor);
        description.add(readmore);
   
        JPanel amenities = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        amenities.setBackground(new Color(242, 242, 247));
        amenities.setPreferredSize(new Dimension(420,120));
        JLabel lblamenities = new JLabel("Main Amenities");
        lblamenities.setFont(new Font("Inter", Font.BOLD, 20));
        amenities.add(lblamenities);
        JPanel amenrow1 = new JPanel(new GridLayout(0,6,-14,-10));
        amenrow1.setBackground(new Color(242, 242, 247));
        amenrow1.add(new JLabel(wifiIcon));
        amenrow1.add(new JLabel("Free Wifi"));
        amenrow1.add(new JLabel(circlex));
        amenrow1.add(new JLabel("Infinity Pool"));
        amenrow1.add(new JLabel(circlex));
        amenrow1.add(new JLabel("Luxury Spa"));
        
        amenities.add(amenrow1);
        
        JPanel amenrow2 = new JPanel(new GridLayout(0,6,-30,-10));
        amenrow2.setBackground(new Color(242, 242, 247));
        amenrow2.add(new JLabel(restaurantIcon));
        amenrow2.add(new JLabel("Restaurant"));
        amenrow2.add(new JLabel(gymIcon));
        amenrow2.add(new JLabel("Fitness Center"));
        amenrow2.add(new JLabel(parkingIcon));
        amenrow2.add(new JLabel("Free Parking"));
        
        
        amenities.add(amenrow2);
  
        JPanel selection = new JPanel(new BorderLayout());
        selection.setPreferredSize(new Dimension(420, 20)); 
        JLabel slctRoom = new JLabel("Select Room");
        selection.setBackground(new Color(242, 242, 247));
        slctRoom.setFont(new Font("Inter", Font.BOLD, 20));
        JLabel allRooms = new JLabel ("See all rooms");
        allRooms.setFont(new Font("Inter", Font.BOLD, 15));
        allRooms.setForeground(new Color(194, 94, 59));
        selection.add(slctRoom, BorderLayout.WEST);
        selection.add(allRooms, BorderLayout.EAST);
        
        JPanel roombooking = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        roombooking.setBackground(new Color(255, 255, 255));
        roombooking.setPreferredSize(new Dimension(420,250));
        roombooking.add(new JLabel(roomIcon));
        JPanel roomdesc = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        JLabel roomname = new JLabel("Panoramic Forest View King Suite");
        roomdesc.setBackground(new Color(255, 255, 255));
        roomdesc.setPreferredSize(new Dimension(320,250));
        roomname.setFont(new Font("Inter", Font.BOLD, 17));
        JLabel roomcont = new JLabel("1 Extra-large double bed - Private Balcony");
        roomcont.setForeground(Color.LIGHT_GRAY);
        roomcont.setFont(new Font("Inter", Font.PLAIN, 10));
        JLabel roomperks = new JLabel("Free Cancellation - Breakfast Included");
        roomperks.setFont(new Font("Inter", Font.BOLD, 14));
        roomperks.setForeground(new Color (0, 153, 0));
        roomdesc.add(roomname);
        roomdesc.add(roomcont);
        roomdesc.add(blank);
        roomdesc.add(blank);
        roomdesc.add(blank);
        roomdesc.add(roomperks);
        roomdesc.add(new JLabel("From RM 240/night"));
        roombooking.add(roomdesc);
        
 
  
        JPanel guestreview = new JPanel(new FlowLayout(FlowLayout.LEFT,0,10));
        guestreview.setBackground(new Color(242, 242, 247));
        guestreview.setPreferredSize(new Dimension(420,1000));
        JLabel revtitle1 = new JLabel("Guest Reviews");
        revtitle1.setFont(new Font("Inter", Font.BOLD, 20));
        JPanel guest1 = new JPanel();
        guest1.setLayout(new BoxLayout(guest1, BoxLayout.Y_AXIS));
        guest1.setBackground(Color.WHITE);
        guest1.setPreferredSize(new Dimension(420,110));
        guestreview.add(revtitle1);
      
        
        JLabel guestname1 = new JLabel("Marcus Ch'ng | 10");
        JLabel date1 = new JLabel("Oct 12, 2024");
        JLabel score1 = new JLabel("10");
        JLabel review1 = new JLabel("<html><body style = 'width: 300px'>" + "The most breathtaking views I have ever experienced. The staff makes you feel at home with incredible attention to detail." + "</body></html>");
        guest1.add(guestname1);  
        guest1.add(date1);       
        guest1.add(review1); 
       
        
        JPanel guest2 = new JPanel();
        guest2.setLayout(new BoxLayout(guest2, BoxLayout.Y_AXIS));
        guest2.setBackground(Color.WHITE);
        guest2.setPreferredSize(new Dimension(420,110));
      
        
        JLabel guestname2 = new JLabel("Marcus Ch'ng | 10");
        JLabel date2 = new JLabel("Oct 12, 2024");
        JLabel score2 = new JLabel("10");
        JLabel review2 = new JLabel("<html><body style = 'width: 300px'>" + "The most breathtaking views I have ever experienced. The staff makes you feel at home with incredible attention to detail." + "</body></html>");
        guest2.add(guestname2);  
        guest2.add(date2);        
        guest2.add(review2); 
        
        
        guestreview.add(guest1);
        guestreview.add(guest2);
        
        

        JButton jbtCall = new JButton("");
        jbtCall.setIcon(callIcon);
        jbtCall.setBorderPainted(false);
        jbtCall.setOpaque(false);
        jbtCall.setContentAreaFilled(true);
        jbtCall.setFocusPainted(false);

        
        
        JPanel footer = new JPanel(new BorderLayout());
        footer.setPreferredSize(new Dimension(450,80));
        footer.setBackground(Color.WHITE);
        JLabel fromprice = new JLabel("   From\nRM 240 ");
        fromprice.setFont(new Font("Inter", Font.BOLD, 15));
        JLabel night = new JLabel("/night (incl. taxes)");
        JButton jbtBook = new JButton("");
        jbtBook.setIcon(bookIcon);
        jbtBook.setBorderPainted(false);
        jbtBook.setOpaque(true);
        jbtBook.setContentAreaFilled(true);
        jbtBook.setFocusPainted(false);
        jbtBook.setBackground(Color.white);
        jbtBook.setForeground(Color.WHITE);
        night.setFont(new Font("Inter", Font.PLAIN, 12));
        footer.add(fromprice, BorderLayout.WEST);
        footer.add(night, BorderLayout.CENTER);
        footer.add(jbtBook, BorderLayout.EAST);
        
 
        
        panel.add(name);
        panel.add(location);
        panel.add(desc);
        content.add(panel);
        content.add(review);	
        content.add(gallery);
        content.add(description);
        content.add(amenities);
        content.add(selection);
        content.add(roombooking);
        content.add(guestreview);
        content.setPreferredSize(new Dimension(450, 1545));

        add(footer, BorderLayout.SOUTH);


        JScrollPane scrollPane = new JScrollPane(content,
                JScrollPane.VERTICAL_SCROLLBAR_NEVER,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scrollPane, BorderLayout.CENTER);
        setSize(450, 1000);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

       
    }

    public static void main(String[] args) {
        new HotelInfo();
    }
}