import java.applet.Applet;
import java.awt.*;

public class Basic extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Hello World", 10, 50);
    }
}
