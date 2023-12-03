package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login2 extends JFrame {

    private JLabel userLabel, passLabel, title;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
    private Font f;
    private ImageIcon background;

    public Login2() {
        // Initialize the JFrame
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create the content pane
        c = getContentPane();
        c.setLayout(null);

        // Set the font
        f = new Font("Harlow Solid Italic", Font.BOLD, 25);

        // Create the title label
        title = new JLabel("Registration");
        title.setForeground(Color.black);
        title.setBounds(500, 140, 150, 50);
        title.setFont(f);
        c.add(title);

        // Create the username label and text field
        userLabel = new JLabel("Username : ");
        userLabel.setForeground(Color.black);
        userLabel.setBounds(350, 230, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(470, 230, 200, 40);
        c.add(tf);

        // Create the password label and password field
        passLabel = new JLabel("Password : ");
        passLabel.setForeground(Color.black);
        passLabel.setBounds(350, 330, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(470, 330, 200, 40);
        pf.setEchoChar('X');
        c.add(pf);

        // Load and display the background image
        ImageIcon img = new ImageIcon(getClass().getResource("pic2.png"));
        Image scaledImage = img.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        background = new ImageIcon(scaledImage);
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 600);
        c.add(backgroundLabel);

        // Create the Confirm button
        loginButton = new JButton("Confirm");
        loginButton.setBounds(420, 430, 120, 30);
        loginButton.setFont(f);
        loginButton.setBackground(Color.green);
        c.add(loginButton);

        // Create the Clear button and add an ActionListener
        clearButton = new JButton("Clear");
        clearButton.setBounds(550, 430, 120, 30);
        clearButton.setFont(f);
        clearButton.setBackground(Color.green);
        c.add(clearButton);

        clearButton.addActionListener(e -> {
            tf.setText("");
            pf.setText("");
        });
        
         loginButton.addActionListener(e -> {
           Login reg = new Login();
                dispose();
                reg.setVisible(true);
           
        });
    }

    public static void main(String args[]) {
        // Create an instance of Login2 and make it visible
        Login2 fr = new Login2();
        fr.setVisible(true);
    }
}
