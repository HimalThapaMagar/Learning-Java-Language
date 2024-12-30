import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setTitle("Simple Interest 074");
        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        JLabel plabel = new JLabel("Enter pricipal amount");
        JTextField pfield = new JTextField(10);
        frame.add(plabel);
        frame.add(pfield);

        JLabel tlabel = new JLabel("Enter time");
        JTextField tfield = new JTextField(10);
        frame.add(tlabel);
        frame.add(tfield);

        JLabel ilabel = new JLabel("Enter interest");
        JTextField ifield = new JTextField(10);
        frame.add(ilabel);
        frame.add(ifield);


        JButton finalButton = new JButton("Final Button");
        JLabel finalLabel = new JLabel("Interest = ");
        frame.add(finalButton);
        frame.add(finalLabel);
        finalButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int p = Integer.parseInt(pfield.getText());
                        int t = Integer.parseInt(tfield.getText());
                        int i = Integer.parseInt(ifield.getText());
                        int simpleinterest = (p*t*i)/100;
                        finalLabel.setText("Interest = " + simpleinterest);
                    }
                }
        );
    }
}