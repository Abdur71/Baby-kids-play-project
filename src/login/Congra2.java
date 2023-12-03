package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Congra2 extends JFrame {
    private Container c;
    private JButton btn1;
    private Font font;

    Congra2() {
        initializeUI();
        setupComponents();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Congratulation 2");
        c = getContentPane();
        c.setLayout(null);

        font = new Font("Harlow Solid Italic", Font.ITALIC, 22);

        ImageIcon img = new ImageIcon(getClass().getResource("Congratulation.jpg"));
        Image scaledImage = img.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon background = new ImageIcon(scaledImage);

        // Create a label to display the background image
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 600);
        c.add(backgroundLabel);
    }

    private void setupComponents() {
        btn1 = new JButton("Next");
        btn1.setBounds(600, 450, 150, 60);
        btn1.setFont(font);
        btn1.setBackground(Color.green);
        c.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                Q3 nf1 = new Q3();
                nf1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Congra2 frame = new Congra2();
        frame.setVisible(true);
    }
}
