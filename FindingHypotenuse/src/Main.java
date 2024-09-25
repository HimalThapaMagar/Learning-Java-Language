import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int p = Integer.parseInt(JOptionPane.showInputDialog("Enter the perpendicular:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the base:"));

        double h;
        h = Math.sqrt((p*p) + (b*b));

        JOptionPane.showMessageDialog(null, "The hypotenuse is " + h);
    }
}