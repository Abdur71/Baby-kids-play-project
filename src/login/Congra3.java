
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

public class Congra3 extends JFrame {
    private Container c;
     private ImageIcon background,icon;
      private JButton btn1, btn2;
       private Font f;
    
    Congra3()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setTitle("Congratulation 3");
        c = this.getContentPane();
        c.setLayout(null);
        
        f = new Font("Harlow Solid Italic", Font.ITALIC, 22); 
         
         
        ImageIcon img = new ImageIcon(getClass().getResource("Congratulation.jpg"));
        Image scaledImage = img.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        background = new ImageIcon(scaledImage);

        // Create a label to display the background image
        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 600);
        c.add(backgroundLabel);
        
        
        btn1 = new JButton("Next");
        btn1.setBounds(600, 450, 150, 60);
        btn1.setFont(f);
        btn1.setBackground(Color.green);
        c.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                Q4 nf1 = new Q4();
                nf1.setVisible(true);
            }
        });
    }
    
    
     public static void main(String[] args) {
        Congra3 frame = new Congra3();
        frame.setVisible(true);
    }
    
}

