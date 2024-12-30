import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static class example extends MouseAdapter {
        public example() {
            JFrame frame = new JFrame("example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);

            frame.addMouseListener(this);
        }
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked: " + e.getX() + "," + e.getY());
        }
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed: " + e.getX() + "," + e.getY());
        }
        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released: " + e.getX() + "," + e.getY());
        }
    }
    public static void main(String[] args) {
        new example();
    }
}