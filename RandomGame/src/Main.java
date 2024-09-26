import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(10) + 1;

        int count = 0;

        int guess = -1;
        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess for random number between 1 -10:"));
            count++;
        } while (guess != x);
        JOptionPane.showMessageDialog(null, "You guessed it in " + count + " times");
    }
}