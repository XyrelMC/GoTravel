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
        
        JLabel revlabel2 = new JLabel("   Uhud Center");
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
        description.add(title);
        description.add(descriptor);
   
        JPanel amenities = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        amenities.setBackground(new Color(242, 242, 247));
        amenities.setPreferredSize(new Dimension(420,175));
        JLabel lblamenities = new JLabel("Main Amenities");
        lblamenities.setFont(new Font("Inter", Font.BOLD, 20));
        amenities.add(lblamenities);
        JPanel amenrow1 = new JPanel(new GridLayout(0,6,-20,-10));
        amenrow1.setBackground(new Color(242, 242, 247));
        amenrow1.add(new JLabel(wifiIcon));
        amenrow1.add(new JLabel("Free Wifi"));
        amenrow1.add(new JLabel(circlex));
        amenrow1.add(new JLabel("Infinity Pool"));
        amenrow1.add(new JLabel(circlex));
        amenrow1.add(new JLabel("Luxury Spa"));
        
        amenities.add(amenrow1);
        
        JPanel amenrow2 = new JPanel(new GridLayout(0,6,-20,-10));
        amenrow2.setBackground(new Color(242, 242, 247));
        amenrow2.add(new JLabel(restaurantIcon));
        amenrow2.add(new JLabel("Restaurant"));
        amenrow2.add(new JLabel(gymIcon));
        amenrow2.add(new JLabel("Fitness Center"));
        amenrow2.add(new JLabel(parkingIcon));
        amenrow2.add(new JLabel("Free Parking"));
        
        
        amenities.add(amenrow2);
        
        panel.add(name);
        panel.add(location);
        panel.add(desc);
        content.add(panel);
        content.add(review);
        content.add(gallery);
        content.add(description);
        content.add(amenities);
        content.setPreferredSize(new Dimension(450, 1200));

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