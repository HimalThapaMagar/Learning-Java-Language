import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
    JOptionPane.showMessageDialog(null, "Ah you are "+age);

    Double gpa = Double.parseDouble(JOptionPane.showInputDialog("What is your gpa?"));
    JOptionPane.showMessageDialog(null, gpa);
    }
}