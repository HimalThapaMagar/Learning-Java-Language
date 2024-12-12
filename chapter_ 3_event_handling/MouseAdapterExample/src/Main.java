import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static class MouseAdapterExample extends MouseAdapter {

        MouseAdapterExample() {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.addMouseListener(this);
        }
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked: " + e.getX() + "," + e.getY());
        }
    }


    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}