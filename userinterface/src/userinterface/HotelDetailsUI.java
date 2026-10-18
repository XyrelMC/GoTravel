package userinterface;   // delete this line if your file is NOT in a package called "userinterface"

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Simple version of the hotel details screen.
 * Only uses: JFrame, JPanel, FlowLayout, GridLayout, BorderLayout,
 * JLabel, JButton, Color, Font, Dimension and borders.
 * (JScrollPane is the one extra, so the long page can scroll.)
 */
public class HotelDetailsUI extends JFrame {

    // ---------- Colours ----------
    private Color orange = new Color(196, 87, 43);
    private Color green = new Color(46, 125, 50);
    private Color gold = new Color(224, 168, 0);
    private Color dark = new Color(31, 35, 40);
    private Color gray = new Color(107, 114, 128);
    private Color line = new Color(220, 222, 226);

    // Width of every section on the page
    private int sectionWidth = 360;

    public HotelDetailsUI() {
        setTitle("Hotel Details");
        setLayout(new BorderLayout());

        // CENTER: all sections stacked in a FlowLayout panel.
        // Each section is 360 wide and the panel is only 380 wide,
        // so FlowLayout puts one section per row (top to bottom).
        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 5));
        content.setBackground(Color.WHITE);
        content.setPreferredSize(new Dimension(380, 840));

        content.add(createHero());
        content.add(createTitleSection());
        content.add(createGallery());
        content.add(createAbout());
        content.add(createAmenities());
        content.add(createRoom());
        content.add(createReviews());

        JScrollPane scroll = new JScrollPane(content);
        scroll.setBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        add(scroll, BorderLayout.CENTER);

        // SOUTH: contact buttons on top, price + Book Now underneath
        JPanel south = new JPanel(new BorderLayout());
        south.add(createContactButtons(), BorderLayout.NORTH);
        south.add(createBottomBar(), BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
    }

    // =====================================================
    //  Sections (one method each)
    // =====================================================

    private JPanel createHero() {
        JPanel hero = makeSection(100, new BorderLayout());
        hero.setBackground(new Color(43, 74, 90));

        // top row: back button on the left, share + heart on the right
        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(new Color(43, 74, 90));
        top.add(new JButton("<"), BorderLayout.WEST);

        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        right.setBackground(new Color(43, 74, 90));
        right.add(new JButton("Share"));
        right.add(new JButton("\u2661"));
        top.add(right, BorderLayout.EAST);

        JLabel photo = makeLabel("[ Hotel Photo ]", 14, Font.PLAIN, Color.WHITE);
        photo.setHorizontalAlignment(SwingConstants.CENTER);

        hero.add(top, BorderLayout.NORTH);
        hero.add(photo, BorderLayout.CENTER);
        return hero;
    }

    private JPanel createTitleSection() {
        JPanel section = makeSection(150, new BorderLayout(0, 5));

        // four lines of text
        JPanel info = new JPanel(new GridLayout(4, 1));
        info.setBackground(Color.WHITE);
        info.add(makeLabel("\u2605\u2605\u2605\u2605\u2605  BOUTIQUE RESORT", 11, Font.BOLD, gold));
        info.add(makeLabel("Alila Wilderness Sanctuary & Spa", 18, Font.BOLD, dark));
        info.add(makeLabel("Jalan Raya Desa, Ubud, Bali, Indonesia", 11, Font.PLAIN, gray));
        info.add(makeLabel("\"A volcanic-rim hideaway with untamed green vistas.\"", 11, Font.ITALIC, gray));

        // rating card: score (west), text (center), location (east)
        JPanel rating = new JPanel(new BorderLayout(10, 0));
        rating.setBackground(Color.WHITE);
        rating.setBorder(new LineBorder(line, 1));

        JLabel score = makeLabel("9.4", 16, Font.BOLD, Color.WHITE);
        score.setOpaque(true);
        score.setBackground(green);
        score.setHorizontalAlignment(SwingConstants.CENTER);
        score.setPreferredSize(new Dimension(50, 50));

        JPanel middle = new JPanel(new GridLayout(2, 1));
        middle.setBackground(Color.WHITE);
        middle.add(makeLabel("Exceptional", 12, Font.BOLD, dark));
        middle.add(makeLabel("1,520 reviews", 10, Font.PLAIN, gray));

        JPanel east = new JPanel(new GridLayout(2, 1));
        east.setBackground(Color.WHITE);
        east.add(makeLabel("Ubud Center", 12, Font.BOLD, dark));
        east.add(makeLabel("1.8 km away  ", 10, Font.PLAIN, gray));

        rating.add(score, BorderLayout.WEST);
        rating.add(middle, BorderLayout.CENTER);
        rating.add(east, BorderLayout.EAST);

        section.add(info, BorderLayout.NORTH);
        section.add(rating, BorderLayout.CENTER);
        return section;
    }

    private JPanel createGallery() {
        JPanel section = makeSection(75, new BorderLayout(0, 5));
        section.add(makeLabel("Photo Gallery", 14, Font.BOLD, dark), BorderLayout.NORTH);

        JPanel photos = new JPanel(new GridLayout(1, 4, 5, 5));
        photos.setBackground(Color.WHITE);
        photos.add(makePhoto("Photo 1", new Color(60, 90, 74)));
        photos.add(makePhoto("Photo 2", new Color(107, 79, 58)));
        photos.add(makePhoto("Photo 3", new Color(47, 72, 88)));
        photos.add(makePhoto("Photo 4", new Color(90, 74, 58)));
        section.add(photos, BorderLayout.CENTER);
        return section;
    }

    private JPanel createAbout() {
        JPanel section = makeSection(95, new BorderLayout(0, 3));
        section.add(makeLabel("About Alila Wilderness", 14, Font.BOLD, dark), BorderLayout.NORTH);

        // <html> and <br> let a JLabel show several lines
        JLabel text = makeLabel("<html>Nestled on the edge of a lush tropical valley,<br>"
                + "Alila Wilderness Sanctuary offers private villas<br>"
                + "with infinity plunge pools and wellness treatments...</html>",
                11, Font.PLAIN, gray);
        section.add(text, BorderLayout.CENTER);
        section.add(makeLabel("Read more", 11, Font.BOLD, orange), BorderLayout.SOUTH);
        return section;
    }

    private JPanel createAmenities() {
        JPanel section = makeSection(75, new BorderLayout(0, 5));
        section.add(makeLabel("Main Amenities", 14, Font.BOLD, dark), BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 3, 5, 5));
        grid.setBackground(Color.WHITE);
        String[] names = {"Free WiFi", "Infinity Pool", "Luxury Spa",
                          "Restaurant", "Fitness Center", "Free Parking"};
        for (int i = 0; i < names.length; i++) {
            grid.add(makeLabel("\u2022 " + names[i], 11, Font.PLAIN, dark));
        }
        section.add(grid, BorderLayout.CENTER);
        return section;
    }

    private JPanel createRoom() {
        JPanel section = makeSection(155, new BorderLayout(0, 5));

        // heading row: "Select Room" on the left, "See all rooms" on the right
        JPanel heading = new JPanel(new BorderLayout());
        heading.setBackground(Color.WHITE);
        heading.add(makeLabel("Select Room", 14, Font.BOLD, dark), BorderLayout.WEST);
        heading.add(makeLabel("See all rooms", 11, Font.BOLD, orange), BorderLayout.EAST);
        section.add(heading, BorderLayout.NORTH);

        // room card
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(new LineBorder(line, 1));

        JLabel photo = makePhoto("[ Room Photo ]", new Color(74, 90, 106));
        photo.setPreferredSize(new Dimension(100, 45));
        card.add(photo, BorderLayout.NORTH);

        JPanel details = new JPanel(new GridLayout(3, 1));
        details.setBackground(Color.WHITE);
        details.add(makeLabel(" Panoramic Forest View King Suite", 13, Font.BOLD, dark));
        details.add(makeLabel(" 1 Extra-large double bed \u2022 Private Balcony", 10, Font.PLAIN, gray));

        JPanel bottom = new JPanel(new BorderLayout());
        bottom.setBackground(Color.WHITE);
        bottom.add(makeLabel(" Free Cancellation \u2022 Breakfast Included", 10, Font.BOLD, green),
                BorderLayout.WEST);
        bottom.add(makeLabel("RM240 / night ", 12, Font.BOLD, dark), BorderLayout.EAST);
        details.add(bottom);

        card.add(details, BorderLayout.CENTER);
        section.add(card, BorderLayout.CENTER);
        return section;
    }

    private JPanel createReviews() {
        JPanel section = makeSection(140, new BorderLayout(0, 5));
        section.add(makeLabel("Guest Reviews", 14, Font.BOLD, dark), BorderLayout.NORTH);

        JPanel list = new JPanel(new GridLayout(2, 1, 0, 5));
        list.setBackground(Color.WHITE);
        list.add(makeReview("Chew Jinyu  (Oct 10, 2024)", "10",
                "\"The most breathtaking views I have ever experienced.<br>"
                + "The staff makes you feel like family.\""));
        list.add(makeReview("Marcus Ching  (Sep 28, 2024)", "9.2",
                "\"The private pools and morning yoga were absolutely<br>"
                + "worth it. Highly recommend.\""));
        section.add(list, BorderLayout.CENTER);
        return section;
    }

    /** "Call hotel" and "Chat with hotel" buttons, aligned to the right. */
    private JPanel createContactButtons() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 4));
        panel.setBackground(Color.WHITE);

        panel.add(makeContactButton("\u260E  Call hotel", green));
        panel.add(makeContactButton("\u2709  Chat with hotel", orange));
        return panel;
    }

    /** A small coloured button. */
    private JButton makeContactButton(String text, Color colour) {
        JButton button = new JButton(text);
        button.setBackground(colour);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("SansSerif", Font.BOLD, 11));
        button.setOpaque(true);            // needed so the colour shows on macOS
        button.setBorderPainted(false);    // needed so the colour shows on macOS
        button.setFocusPainted(false);
        return button;
    }

    private JPanel createBottomBar() {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(Color.WHITE);
        bar.setBorder(new EmptyBorder(8, 15, 8, 15));

        JLabel price = new JLabel("<html><small>From</small><br>"
                + "<b>RM240</b> / night (included taxes)</html>");
        price.setForeground(dark);

        JButton book = new JButton("Book Now  >");
        book.setBackground(orange);
        book.setForeground(Color.WHITE);
        book.setFont(new Font("SansSerif", Font.BOLD, 13));
        book.setOpaque(true);            // needed so the colour shows on macOS
        book.setBorderPainted(false);    // needed so the colour shows on macOS
        book.setFocusPainted(false);
        book.setPreferredSize(new Dimension(125, 40));

        bar.add(price, BorderLayout.WEST);
        bar.add(book, BorderLayout.EAST);
        return bar;
    }

    // =====================================================
    //  Small helper methods (so we don't repeat code)
    // =====================================================

    /** A white panel with a fixed height and the standard section width. */
    private JPanel makeSection(int height, LayoutManager layout) {
        JPanel p = new JPanel(layout);
        p.setPreferredSize(new Dimension(sectionWidth, height));
        p.setBackground(Color.WHITE);
        return p;
    }

    /** A label with a font and a text colour. */
    private JLabel makeLabel(String text, int size, int style, Color colour) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", style, size));
        label.setForeground(colour);
        return label;
    }

    /** A coloured box that stands in for a photo. */
    private JLabel makePhoto(String text, Color colour) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(colour);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("SansSerif", Font.PLAIN, 10));
        return label;
    }

    /** One review card: name (west), score (east), quote (center). */
    private JPanel makeReview(String name, String scoreText, String quote) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(new LineBorder(line, 1));

        JPanel top = new JPanel(new BorderLayout());
        top.setBackground(Color.WHITE);
        top.add(makeLabel(" " + name, 11, Font.BOLD, dark), BorderLayout.WEST);

        JLabel score = makeLabel(scoreText, 10, Font.BOLD, Color.WHITE);
        score.setOpaque(true);
        score.setBackground(green);
        score.setHorizontalAlignment(SwingConstants.CENTER);
        score.setPreferredSize(new Dimension(35, 18));
        top.add(score, BorderLayout.EAST);

        card.add(top, BorderLayout.NORTH);
        card.add(makeLabel("<html>&nbsp;" + quote + "</html>", 10, Font.PLAIN, dark),
                BorderLayout.CENTER);
        return card;
    }

    // =====================================================
    //  main
    // =====================================================

    public static void main(String[] args) {
        HotelDetailsUI frame = new HotelDetailsUI();
        frame.setSize(400, 820);
        frame.setLocationRelativeTo(null);   // center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}