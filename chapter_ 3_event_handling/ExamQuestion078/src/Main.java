import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {
    public static class SumAndDifference implements MouseListener {
        private JTextField num1;
        private JTextField num2;
        private JLabel resultLabel;

        SumAndDifference() {
            // Frame setup
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setTitle("Sum and Difference Calculator");
            frame.setLayout(new FlowLayout(FlowLayout.CENTER));

            // Components
            num1 = new JTextField(5);
            num2 = new JTextField(5);
            resultLabel = new JLabel("Result will appear here");

            // Adding components
            frame.add(new JLabel("Number 1:"));
            frame.add(num1);
            frame.add(new JLabel("Number 2:"));
            frame.add(num2);
            frame.add(resultLabel);

            // Adding MouseListener to the frame
            frame.addMouseListener(this);

            // Finalizing frame
            frame.setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // Not needed for this task
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int sum = number1 + number2;
                resultLabel.setText("Sum: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            try {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                int difference = number1 - number2;
                resultLabel.setText("Difference: " + difference);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // Not needed for this task
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // Not needed for this task
        }
    }

    public static void main(String[] args) {
        new SumAndDifference();
    }
}
