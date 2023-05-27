/*WAP TO DISPLAY IP ADDRESS OF ANY WEBSITE ON JFRAME */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.*;

public class IPAddressDisplay extends JFrame implements ActionListener {

  private JTextField textField;
  private JButton displayButton;
  private JLabel resultLabel;

  public IPAddressDisplay() {
    // Set frame properties
    setTitle("IP Address Display");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Create text field
    textField = new JTextField();
    textField.setBounds(30, 30, 200, 30);

    // Create display button
    displayButton = new JButton("Display IP");
    displayButton.setBounds(30, 70, 100, 30);
    displayButton.addActionListener(this);

    // Create result label
    resultLabel = new JLabel();
    resultLabel.setBounds(30, 110, 200, 30);

    // Create panel
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.add(textField);
    panel.add(displayButton);
    panel.add(resultLabel);

    // Set panel for the frame
    setContentPane(panel);

    // Display the frame
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == displayButton) {
      String website = textField.getText();
      try {
        InetAddress ipAddress = InetAddress.getByName(website);
        String ip = ipAddress.getHostAddress();
        resultLabel.setText("IP Address: " + ip);
      } catch (UnknownHostException ex) {
        resultLabel.setText("Invalid website!");
      }
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new IPAddressDisplay();
        }
      }
    );
  }
}
