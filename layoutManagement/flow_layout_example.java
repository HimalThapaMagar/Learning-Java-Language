import java.awt.FlowLayout;
import javax.swing.*;

public class flow_layout_example {
    public static void main(String[] args) {
        
        JFrame Jframe = new JFrame("Flow Layout Example");
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("First Name");
        Jframe.add(label1);

        JButton button1 = new JButton("Button1");
        Jframe.add(button1);

        Jframe.setLayout(new FlowLayout(FlowLayout.CENTER));
        Jframe.setSize(200,200);
        Jframe.setVisible(true);
    }
}