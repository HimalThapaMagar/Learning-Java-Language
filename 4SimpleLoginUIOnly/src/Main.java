
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setTitle("Simple Login UI Only");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setSize(400, 400);

        GridBagLayout gridBagLayout = new GridBagLayout();
        jframe.setLayout(gridBagLayout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Padding

        JLabel jlabel = new JLabel("Welcome to Simple Login UI Only");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        jframe.add(jlabel, constraints);

        JLabel emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        jframe.add(emailLabel, constraints);

        JTextField emailField = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        jframe.add(emailField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        jframe.add(passwordLabel, constraints);

        JPasswordField passwordField = new JPasswordField(10);
        constraints.gridx = 1;
        constraints.gridy = 2;
        jframe.add(passwordField, constraints);

        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        jframe.add(loginButton, constraints);

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        });

        JButton dummyButton = new JButton("DUMMY");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        jframe.add(dummyButton, constraints);

    }
}
