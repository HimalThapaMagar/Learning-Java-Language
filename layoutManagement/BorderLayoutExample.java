import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Border Layout Example");

        JLabel label1 = new JLabel("this is east");
        jframe.add(label1, BorderLayout.EAST);
        JLabel label2 = new JLabel("this is west");
        jframe.add(label2, BorderLayout.WEST);
        JLabel label3 = new JLabel("this is north");
        jframe.add(label3, BorderLayout.NORTH);
        JLabel label4 = new JLabel("this is south");
        jframe.add(label4, BorderLayout.SOUTH);
        JLabel label5 = new JLabel("this is center");
        jframe.add(label5, BorderLayout.CENTER);
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setSize(300, 300);
    }
}