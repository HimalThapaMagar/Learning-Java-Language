import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static class twoButtonsExample {
        twoButtonsExample(){
            JFrame frame = new JFrame();
            frame.setTitle("Two buttons example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setVisible(true);

            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            frame.setLayout(new FlowLayout(FlowLayout.CENTER));
            frame.add(button1);
            frame.add(button2);

            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button 1 clicked");
                }
            });

            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button 2 clicked");
                }
            });
        }
    }
    public static void main(String[] args) {
        new twoButtonsExample();
    }
}