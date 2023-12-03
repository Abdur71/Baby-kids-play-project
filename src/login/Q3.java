package login;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q3 extends JFrame {
    private JLabel imgLabel;
    private ImageIcon img;
    private Container container;
    private JPanel panel;
    private JButton clockButton, planeButton;
    private Font buttonFont;

    Q3() {
        initializeUI();
        setupComponents();
    }

    private void initializeUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Question 3");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        buttonFont = new Font("Harlow Solid Italic", Font.ITALIC, 22);

        panel = new JPanel();
        panel.setBounds(100, 200, 500, 400);
        container.add(panel);

        img = new ImageIcon(getClass().getResource("Clock.jpg"));
        imgLabel = new JLabel(img);
        panel.add(imgLabel);
    }

    private void setupComponents() {
        clockButton = new JButton("Clock");
        clockButton.setFont(buttonFont);
        clockButton.setBackground(Color.pink);
        panel.add(clockButton);

        clockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                Congra3 nf1 = new Congra3();
                nf1.setVisible(true);
            }
        });

        planeButton = new JButton("Plane");
        planeButton.setBackground(Color.yellow);
        planeButton.setFont(buttonFont);
        panel.add(planeButton);

        planeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                wrong3 nf1 = new wrong3();
                nf1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Q3 frame = new Q3();
        frame.setVisible(true);
    }
}
