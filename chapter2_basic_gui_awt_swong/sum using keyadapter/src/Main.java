import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static class SumQuestion extends KeyAdapter {
        JTextField number1 = new JTextField(10);
        JTextField number2 = new JTextField(10);
        JLabel resultLabel = new JLabel("Result: ");

        public SumQuestion() {
            // Create the frame
            JFrame frame = new JFrame("Sum Question");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLayout(new FlowLayout()); // Use FlowLayout for proper alignment
            
            frame.add(number1);

            frame.add(number2);
            frame.add(resultLabel);

            // Attach KeyAdapter to both text fields
            number1.addKeyListener(this);
            number2.addKeyListener(this);

            // Make the frame visible
            frame.setVisible(true);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            try {
                // Parse integers from text fields
                int a = Integer.parseInt(number1.getText());
                int b = Integer.parseInt(number2.getText());
                int sum = a + b;

                // Update the result label
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                // Handle invalid input gracefully
                resultLabel.setText("Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        new SumQuestion();
    }
}
