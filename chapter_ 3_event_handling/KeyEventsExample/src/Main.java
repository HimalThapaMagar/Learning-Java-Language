import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static class KeyEventExample implements KeyListener {
        KeyEventExample() {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("KeyEventExample");
            frame.setSize(300, 300);
            frame.setVisible(true);

            JTextArea textArea = new JTextArea();
            textArea.setSize(100, 100);
            frame.add(textArea);
            textArea.addKeyListener(this);
        }
        public void keyPressed(KeyEvent e) {
            System.out.println("Key pressed: " + e.getKeyCode());
        }
        public void keyReleased(KeyEvent e) {
            System.out.println("Key released: " + e.getKeyCode());
        }
        public void keyTyped(KeyEvent e) {
            System.out.println("Key typed: " + e.getKeyCode());
        }
    }
    public static void main(String[] args) {
        new KeyEventExample();
    }
}