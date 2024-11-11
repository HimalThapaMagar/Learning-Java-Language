import javax.swing.*;

public class no_layout_example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JLabel label1 = new JLabel("Hello");
        label1.setBounds(100, 100, 100, 30);

        JButton button1 = new JButton("Click here to see magic");
        button1.setBounds(100, 150, 200, 30);
        frame.add(button1);
        frame.add(label1);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}