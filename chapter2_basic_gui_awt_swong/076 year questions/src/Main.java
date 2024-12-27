import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Sum of Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel numberLabel1 = new JLabel("Enter first number:");
        JTextField numberField1 = new JTextField(10);
        JLabel numberLabel2 = new JLabel("Enter second number:");
        JTextField numberField2 = new JTextField(10);
        JLabel resultLabel = new JLabel("The sum is: ");

        // Add components to the frame
        frame.add(numberLabel1);
        frame.add(numberField1);
        frame.add(numberLabel2);
        frame.add(numberField2);
        frame.add(resultLabel);

        // Add key listener to both text fields
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    // Parse numbers from the text fields
                    int num1 = Integer.parseInt(numberField1.getText());
                    int num2 = Integer.parseInt(numberField2.getText());

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Update the result label
                    resultLabel.setText("The sum is: " + sum);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        };

        // Attach the key adapter to both text fields
        numberField1.addKeyListener(keyAdapter);
        numberField2.addKeyListener(keyAdapter);

        // Make the frame visible
        frame.setVisible(true);
    }
}
