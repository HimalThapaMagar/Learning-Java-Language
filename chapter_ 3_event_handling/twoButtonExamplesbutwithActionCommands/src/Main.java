import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Main {
    public static class TwoButtonsWithActionCommands {
        TwoButtonsWithActionCommands() {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Two Buttons with Action Commands");
            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());

            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            frame.add(button1);
            frame.add(button2);
            button1.setActionCommand("Button1");
            button2.setActionCommand("Button2");



            ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("Button1")) {
                        System.out.println("Button1 clicked");
                    }
                    if (command.equals("Button2")) {
                        System.out.println("Button2 clicked");
                    }
                }
            };
            button1.addActionListener(actionListener);
            button2.addActionListener(actionListener);

        }
    }
    public static void main(String[] args) {
        new TwoButtonsWithActionCommands();
    }
}