package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    Container c = getContentPane();
    JPanel PFlightTypes = new JPanel(null);
    JPanel PLogin = new JPanel(null);
    JPanel PFlightDetails = new JPanel(null);

    public boolean bCheck = true;

    JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
    JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");

    JLabel LUserName, LPassword;

    JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
    JLabel LInternationalFlight1 = new JLabel("<html><B>International Flight Booking</B></html>");

    JTextField TFUserName;
    JPasswordField TPPassword;

    JButton BLogin;

    final Object[] col1 = { "From", "To", "Price", "Time" };
    final Object[] col2 = { "From", "To", "Price", "Time" };
    final Object[] col3 = { "From", "To", "Price", "Time" };

    final Object[][] row1 = {
            { "Trivandrum", "Bangalore", "3125", "16:30" },
            { "Trivandrum", "Chennai", "3225", "19:00" },
            { "Trivandrum", "Delhi", "1425", "08:30" },
            { "Trivandrum", "Goa", "1025", "09:50" },
            { "Trivandrum", "Hyderabad", "1525", "11:00" },
            { "Trivandrum", "Kolkata", "3825", "05:30" },
            { "Trivandrum", "Lucknow", "3025", "05:30" },
            { "Trivandrum", "Mumbai", "1725", "12:00" },
            { "Trivandrum", "Vishakapatnam", "3725", "19:00" }
    };
    final Object[][] row2 = {
            { "Trivandrum", "Bali", "21485", "06:20" },
            { "Trivandrum", "Bangkok", "9000", "20:45" },
            { "Trivandrum", "Cairo", "22975", "10:25" },
            { "Trivandrum", "CapeTown", "42500", "16:45" },
            { "Trivandrum", "Chicago", "35000", "06:30" },
            { "Trivandrum", "Dubai", "12000", "08:15" },
            { "Trivandrum", "Frankfurt", "18500", "06:50" },
            { "Trivandrum", "HongKong", "20845", "12:00" },
            { "Trivandrum", "Istanbul", "22000", "10:45" },
            { "Trivandrum", "London", "22600", "14:35" },
            { "Trivandrum", "LosAngeles", "35000", "22:00" },
            { "Trivandrum", "Melbourne", "27800", "21:15" },
            { "Trivandrum", "New York", "32000", "08:50" },
            { "Trivandrum", "Paris", "18500", "18:45" },
            { "Trivandrum", "Rome", "19900", "20:00" },
            { "Trivandrum", "SanFrancisco", "35000", "12:00" },
            { "Trivandrum", "Shanghai", "24430", "10:15" },
            { "Trivandrum", "Singapore", "9000", "21:10" },
            { "Trivandrum", "Sydney", "27800", "12:00" },
            { "Trivandrum", "Toronto", "35000", "17:00" }
    };
    final Object[][] row3 = {
            { "Trivandrum", "Bangalore", "9375", "16:30" },
            { "Trivandrum", "Chennai", "9675", "19:00" },
            { "Trivandrum", "Delhi", "4275", "08:30" },
            { "Trivandrum", "Goa", "3075", "09:50" },
            { "Trivandrum", "Hyderabad", "4575", "11:00" },
            { "Trivandrum", "Kolkata", "11475", "05:30" },
            { "Trivandrum", "Lucknow", "9075", "05:30" },
            { "Trivandrum", "Mumbai", "5175", "12:00" },
            { "Trivandrum", "Vishakapatnam", "11175", "19:00" }
    };
    final Object[][] row4 = {
            { "Trivandrum", "Bali", "64455", "06:20" },
            { "Trivandrum", "Bangkok", "27000", "20:45" },
            { "Trivandrum", "Cairo", "68925", "10:25" },
            { "Trivandrum", "CapeTown", "37500", "16:45" },
            { "Trivandrum", "Chicago", "105000", "06:30" },
            { "Trivandrum", "Dubai", "36000", "08:15" },
            { "Trivandrum", "Frankfurt", "55500", "06:50" },
            { "Trivandrum", "HongKong", "62535", "12:00" },
            { "Trivandrum", "Istanbul", "66000", "10:45" },
            { "Trivandrum", "London", "67800", "14:35" },
            { "Trivandrum", "LosAngeles", "105000", "22:00" },
            { "Trivandrum", "Melbourne", "83400", "21:15" },
            { "Trivandrum", "New York", "96000", "08:50" },
            { "Trivandrum", "Paris", "55500", "18:45" },
            { "Trivandrum", "Rome", "59700", "20:00" },
            { "Trivandrum", "SanFrancisco", "105000", "12:00" },
            { "Trivandrum", "Shanghai", "73290", "10:15" },
            { "Trivandrum", "Singapore", "27000", "21:10" },
            { "Trivandrum", "Sydney", "83400", "12:00" },
            { "Trivandrum", "Toronto", "105000", "17:00" }
    };

    JTable TDomesticFlight = new JTable(row1, col1);
    JTable TInternationalFlight = new JTable(row2, col2);
    JTable TDomesticFlight1 = new JTable(row3, col3);
    JTable TInternationalFlight1 = new JTable(row4, col2);

    JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    Icon img1 = new ImageIcon("img/economic.jpg");
    Icon img2 = new ImageIcon("img/business.jpg");
    Icon img3 = new ImageIcon("img/economic1.jpg");
    Icon img4 = new ImageIcon("img/business1.jpg");

    JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
    JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
    JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
    JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);

    public LoginPage() {
        WindowUtilities.setNativeLookAndFeel();
        setPreferredSize(new Dimension(800, 600));

        PFlightTypes.setBackground(Color.white);
        PLogin.setBackground(Color.white);
        PFlightDetails.setBackground(Color.white);

        JSP1.setBounds(0, 340, 790, 200);
        JSP2.setBounds(0, 340, 790, 200);
        JSP3.setBounds(0, 340, 790, 200);
        JSP4.setBounds(0, 340, 790, 200);

        PFlightTypes.setBounds(0, 0, 500, 340);
        PLogin.setBounds(500, 0, 350, 340);
        PFlightDetails.setBounds(0, 340, 850, 210);

        LDomesticFlight.setBounds(10, 10, 200, 30);
        LInternationalFlight.setBounds(10, 160, 200, 30);
        LUserName = new JLabel("Username: ");
        LPassword = new JLabel("Password: ");
        TFUserName = new JTextField(20);
        TPPassword = new JPasswordField(20);
        BLogin = new JButton("Login");

        LDomesticFlight1.setBounds(10, 10, 200, 30);
        LInternationalFlight1.setBounds(10, 160, 200, 30);
        LEconomic.setBounds(20, 60, 250, 30);
        LBusiness.setBounds(20, 90, 250, 30);
        LEconomic1.setBounds(20, 210, 250, 30);
        LBusiness1.setBounds(20, 240, 250, 30);

        LUserName.setBounds(50, 100, 100, 25);
        LPassword.setBounds(50, 140, 100, 25);
        TFUserName.setBounds(150, 100, 150, 25);
        TPPassword.setBounds(150, 140, 150, 25);
        BLogin.setBounds(150, 180, 100, 25);

        PFlightTypes.add(LDomesticFlight);
        PFlightTypes.add(LInternationalFlight);
        PFlightTypes.add(LEconomic);
        PFlightTypes.add(LBusiness);
        PFlightTypes.add(LEconomic1);
        PFlightTypes.add(LBusiness1);

        PLogin.add(LUserName);
        PLogin.add(LPassword);
        PLogin.add(TFUserName);
        PLogin.add(TPPassword);
        PLogin.add(BLogin);

        c.add(PFlightTypes);
        c.add(PLogin);
        c.add(PFlightDetails);

        setSize(800, 600);
        setVisible(true);

        BLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = TFUserName.getText();
                String password = new String(TPPassword.getPassword());
                if (userName.equals("java") && password.equals("swing")) {
                    JOptionPane.showMessageDialog(null, "You have successfully logged in.");
                    if (bCheck) {
                        PFlightDetails.add(JSP1);
                        PFlightDetails.add(JSP2);
                        bCheck = false;
                    } else {
                        PFlightDetails.remove(JSP1);
                        PFlightDetails.remove(JSP2);
                        bCheck = true;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });

        LEconomic.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PFlightDetails.removeAll();
                PFlightDetails.add(JSP1);
                PFlightDetails.repaint();
                PFlightDetails.revalidate();
            }
        });

        LBusiness.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PFlightDetails.removeAll();
                PFlightDetails.add(JSP3);
                PFlightDetails.repaint();
                PFlightDetails.revalidate();
            }
        });

        LEconomic1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PFlightDetails.removeAll();
                PFlightDetails.add(JSP2);
                PFlightDetails.repaint();
                PFlightDetails.revalidate();
            }
        });

        LBusiness1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PFlightDetails.removeAll();
                PFlightDetails.add(JSP4);
                PFlightDetails.repaint();
                PFlightDetails.revalidate();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

class WindowUtilities {
    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
