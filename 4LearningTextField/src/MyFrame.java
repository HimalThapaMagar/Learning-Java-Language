import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class MyFrame extends JFrame implements ActionListener {

    JButton jButton;
    JLabel label;
    JTextField jtf;

    MyFrame() {

        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        jButton = new JButton("Submit");
        label = new JLabel("Enter Your Name");
        jtf = new JTextField(20);

        this.add(jButton);
        this.add(label);
        this.add(jtf);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jButton) {
        System.out.println(jtf.getText());
    }
    }
}
