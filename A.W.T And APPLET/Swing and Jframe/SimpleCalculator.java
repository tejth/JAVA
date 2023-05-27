/*Simple calculator using swing */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {

  private JTextField textField;
  private JButton[] numberButtons;
  private JButton[] functionButtons;
  private JButton addButton, subtractButton, multiplyButton, divideButton;
  private JButton decimalButton, equalButton, deleteButton, clearButton;
  private JPanel panel;

  private double num1 = 0, num2 = 0, result = 0;
  private char operator;

  public SimpleCalculator() {
    // Set frame properties
    setTitle("Simple Calculator");
    setSize(300, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Create text field
    textField = new JTextField();
    textField.setBounds(30, 30, 240, 30);
    textField.setEditable(false);

    // Create number buttons
    numberButtons = new JButton[10];
    for (int i = 0; i < 10; i++) {
      numberButtons[i] = new JButton(String.valueOf(i));
    }

    // Create function buttons
    functionButtons = new JButton[7];
    addButton = new JButton("+");
    subtractButton = new JButton("-");
    multiplyButton = new JButton("*");
    divideButton = new JButton("/");
    decimalButton = new JButton(".");
    equalButton = new JButton("=");
    deleteButton = new JButton("Delete");
    clearButton = new JButton("Clear");

    functionButtons[0] = addButton;
    functionButtons[1] = subtractButton;
    functionButtons[2] = multiplyButton;
    functionButtons[3] = divideButton;
    functionButtons[4] = decimalButton;
    functionButtons[5] = equalButton;
    functionButtons[6] = deleteButton;

    // Set bounds for function buttons
    int x = 30, y = 80;
    for (int i = 0; i < 7; i++) {
      functionButtons[i].setBounds(x, y, 50, 50);
      functionButtons[i].addActionListener(this);
      x += 60;
      if (i == 2 || i == 5) {
        x = 30;
        y += 60;
      }
    }

    // Set bounds for number buttons
    x = 30;
    y = 220;
    for (int i = 9; i >= 0; i--) {
      numberButtons[i].setBounds(x, y, 50, 50);
      numberButtons[i].addActionListener(this);
      x += 60;
      if (i % 3 == 0) {
        x = 30;
        y -= 60;
      }
    }

    // Create panel
    panel = new JPanel();
    panel.setLayout(null);
    panel.add(textField);
    for (int i = 0; i < 10; i++) {
      panel.add(numberButtons[i]);
    }
    for (int i = 0; i < 7; i++) {
      panel.add(functionButtons[i]);
    }

    // Set panel for the frame
    setContentPane(panel);

    // Display the frame
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < 10; i++) {
      if (e.getSource() == numberButtons[i]) {
        textField.setText(textField.getText().concat(String.valueOf(i)));
      }
    }
    if (e.getSource() == decimalButton) {
      textField.setText(textField.getText().concat("."));
    }
    if (e.getSource() == addButton) {
      num1 = Double.parseDouble(textField.getText());
      operator = '+';
      textField.setText("");
    }
    if (e.getSource() == subtractButton) {
      num1 = Double.parseDouble(textField.getText());
      operator = '-';
      textField.setText("");
    }
    if (e.getSource() == multiplyButton) {
      num1 = Double.parseDouble(textField.getText());
      operator = '*';
      textField.setText("");
    }
    if (e.getSource() == divideButton) {
      num1 = Double.parseDouble(textField.getText());
      operator = '/';
      textField.setText("");
    }
    if (e.getSource() == equalButton) {
      num2 = Double.parseDouble(textField.getText());
      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          result = num1 / num2;
          break;
      }
      textField.setText(String.valueOf(result));
    }
    if (e.getSource() == clearButton) {
      textField.setText("");
    }
    if (e.getSource() == deleteButton) {
      String currentText = textField.getText();
      if (!currentText.isEmpty()) {
        textField.setText(currentText.substring(0, currentText.length() - 1));
      }
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new SimpleCalculator();
        }
      }
    );
  }
}
