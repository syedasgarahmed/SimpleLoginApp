import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleLoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                if (isValidCredentials(username, password)) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
} else {                    JOptionPane.showMessageDialog(frame, "Login Failed. Please try again.");
                }

        passwordField.setText("");
            }        });
        frame.setVisible(true);
    }
   
    private static boolean isValidCredentials(String username, String password) {
        return username.equals("user") && password.equals("password");
    }
}
