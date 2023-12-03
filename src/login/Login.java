package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    private JLabel userLabel, passLabel, title;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton, registrationButton;
    private Container container;
    private Font font;
    private ImageIcon background, icon;

    Login() {
        initializeUI();
        setupComponents();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Login Demo");

        icon = new ImageIcon(getClass().getResource("title.jpg"));
        setIconImage(icon.getImage());

        container = getContentPane();
        container.setLayout(null);

        font = new Font("Harlow Solid Italic", Font.BOLD, 25);

        title = new JLabel("Login");
        title.setForeground(Color.black);
        title.setBounds(500, 140, 150, 50);
        title.setFont(font);
        container.add(title);

        userLabel = new JLabel("Username: ");
        userLabel.setForeground(Color.black);
        userLabel.setBounds(400, 230, 150, 50);
        userLabel.setFont(font);
        container.add(userLabel);

        tf = new JTextField();
        tf.setFont(font);
        tf.setBounds(520, 230, 200, 40);
        container.add(tf);

        passLabel = new JLabel("Password: ");
        passLabel.setForeground(Color.black);
        passLabel.setBounds(400, 330, 150, 50);
        passLabel.setFont(font);
        container.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(520, 330, 200, 40);
        pf.setEchoChar('X');
        container.add(pf);

        // Load the background image and scale it to fit the frame size
        ImageIcon img = new ImageIcon(getClass().getResource("pic2.png"));
        Image scaledImage = img.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        background = new ImageIcon(scaledImage);

        // Create a label to display the background image
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 600);
        container.add(backgroundLabel);

        loginButton = new JButton("Login");
        loginButton.setBounds(500, 430, 100, 30);
        loginButton.setFont(font);
        loginButton.setBackground(Color.green);
        container.add(loginButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(600, 430, 100, 30);
        clearButton.setFont(font);
        clearButton.setBackground(Color.green);
        container.add(clearButton);

        registrationButton = new JButton("Registration");
        registrationButton.setBounds(350, 500, 200, 30);
        registrationButton.setFont(font);
        registrationButton.setBackground(Color.green);
        container.add(registrationButton);
    }

    private void setupComponents() {
        clearButton.addActionListener(e -> {
            tf.setText("");
            pf.setText("");
        });

        loginButton.addActionListener(e -> {
            String userName = tf.getText();
            String password = new String(pf.getPassword());

            if (userName.equals("A.Rafiu") && password.equals("007")) {
                dispose();
                Q1 nf = new Q1();
                nf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Your password or username is invalid");
            }
        });

        registrationButton.addActionListener(e -> {
            dispose();
            Login2 reg = new Login2();
            reg.setVisible(true);
        });
    }

    public static void main(String[] args) {
        Login frame = new Login();
        frame.setVisible(true);
    }
}
