import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JTextArea textArea = new JTextArea();
        frame.add(textArea);
        textArea.setEditable(true);

        // text listener was deprecated and used old awt something for newer J framework or soemthing
    }
}