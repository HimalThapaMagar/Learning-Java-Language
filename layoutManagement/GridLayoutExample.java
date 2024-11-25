
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        // frame.setLayout(new GridLayout());
        frame.setLayout(new GridLayout(2,2,10,10));

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
