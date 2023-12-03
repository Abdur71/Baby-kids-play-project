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

public class Q4 extends JFrame {
    private JLabel imgLabel;
    private ImageIcon img;
    private Container c;
    private ImageIcon background, icon;
    private JPanel panel1;
    private JButton btn1, btn2;
    private Font f;  // Declare the font

    Q4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Question 4");
        c = this.getContentPane();
        c.setLayout(new FlowLayout());  // Use FlowLayout
        c.setBackground(Color.WHITE);

        f = new Font("Harlow Solid Italic", Font.ITALIC, 22);  // Use a suitable font name

        panel1 = new JPanel();
        panel1.setBounds(100, 200, 500, 400);
        panel1.setBackground(Color.WHITE);
        c.add(panel1);

        img = new ImageIcon(getClass().getResource("plane.jpg"));

        imgLabel = new JLabel(img);
        panel1.add(imgLabel);

        btn1 = new JButton("Plane");
        btn1.setFont(f);
        btn1.setBackground(Color.pink);
        panel1.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                Congra4 nf1 = new Congra4();
                nf1.setVisible(true);
            }
        });

        btn2 = new JButton("Flag");
        btn2.setBackground(Color.yellow);
        btn2.setFont(f);
        panel1.add(btn2);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                wrong4 nf1 = new wrong4();
                nf1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Q4 frame = new Q4();
        frame.setVisible(true);
    }
}
