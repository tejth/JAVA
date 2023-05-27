/*to display username and password on frame in swing. */

import javax.swing.*;

public class usernamePaasword extends JFrame {

  private JLabel usernameLabel;
  private JLabel passwordLabel;
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton submitButton;

  public usernamePaasword() {
    // Set frame properties
    setTitle("Username and Password");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Create components
    usernameLabel = new JLabel("Username:");
    passwordLabel = new JLabel("Password:");
    usernameField = new JTextField(20);
    passwordField = new JPasswordField(20);
    submitButton = new JButton("Submit");

    // Set layout
    setLayout(new java.awt.FlowLayout());

    // Add components to the frame
    add(usernameLabel);
    add(usernameField);
    add(passwordLabel);
    add(passwordField);
    add(submitButton);

    // Display the frame
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new usernamePaasword();
        }
      }
    );
  }
}
