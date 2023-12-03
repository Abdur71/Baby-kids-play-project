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

public class Q2 extends JFrame {
    private JLabel imgLabel;
    private ImageIcon img;
    private Container c;
    private ImageIcon background, icon;
    private JPanel panel1;
    private JButton btn1, btn2;
    private Font f;  // Declare the font

    Q2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Question 2");
        c = this.getContentPane();
        c.setLayout(new FlowLayout());  // Use FlowLayout

        f = new Font("Harlow Solid Italic", Font.ITALIC, 22);  // Use a suitable font name

        panel1 = new JPanel();
        panel1.setBounds(100, 200, 500, 400);
        c.add(panel1);

        img = new ImageIcon(getClass().getResource("Cat.jpg"));

        imgLabel = new JLabel(img);
        panel1.add(imgLabel);

        btn1 = new JButton("Car");
        btn1.setFont(f);
        btn1.setBackground(Color.pink);
        panel1.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                wrong2 nf1 = new wrong2();
                nf1.setVisible(true);
            }
        });

        

        btn2 = new JButton("Cat");
        btn2.setBackground(Color.yellow);
        btn2.setFont(f);
        panel1.add(btn2);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                Congra2 nf1 = new Congra2();
                nf1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Q2 frame = new Q2();
        frame.setVisible(true);
    }
}
