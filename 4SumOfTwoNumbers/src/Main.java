import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Sum of Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        JLabel heading = new JLabel("Sum of Two Numbers");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        frame.add(heading, c);

        JLabel num1 = new JLabel("Enter First Number");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        frame.add(num1, c);
        JTextField num1value = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        frame.add(num1value, c);

        JLabel num2 = new JLabel("Enter Second Number");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        frame.add(num2, c);
        JTextField num2value = new JTextField(10);
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        frame.add(num2value, c);

        JButton sum = new JButton("Add");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        frame.add(sum, c);

        JLabel sumvalue = new JLabel("Sum of Two Numbers: " );
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        frame.add(sumvalue, c);

        sum.addActionListener(e -> {
            int x = Integer.parseInt(num1value.getText());
            int y = Integer.parseInt(num2value.getText());
            int sumValue = x + y;
            sumvalue.setText("Sum of Two Numbers: " + sumValue);
        });
    }
}