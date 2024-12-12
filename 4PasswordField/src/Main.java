import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,400);

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(10);
        layout.setVgap(10);

        JLabel label = new JLabel("Enter Password");
        frame.add(label);
        JPasswordField password = new JPasswordField(10);
        frame.add(password);
        JButton button = new JButton("Submit");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pass = new String(password.getPassword());
                System.out.println(pass);
            }
        });
    }
}