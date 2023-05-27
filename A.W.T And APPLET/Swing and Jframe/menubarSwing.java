/* 	WAP to create menu bar in swing. */
import javax.swing.*;

public class menubarSwing extends JFrame {

  public menubarSwing() {
    // Set frame properties
    setTitle("Menu Bar Example");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create menu bar and menus
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    // Create menu items
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenuItem cutItem = new JMenuItem("Cut");
    JMenuItem copyItem = new JMenuItem("Copy");
    JMenuItem pasteItem = new JMenuItem("Paste");
    JMenuItem aboutItem = new JMenuItem("About");

    // Add menu items to the menus
    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.add(saveItem);
    fileMenu.addSeparator();
    fileMenu.add(exitItem);
    editMenu.add(cutItem);
    editMenu.add(copyItem);
    editMenu.add(pasteItem);
    helpMenu.add(aboutItem);

    // Add menus to the menu bar
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);

    // Set the menu bar for the frame
    setJMenuBar(menuBar);

    // Display the frame
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new menubarSwing();
        }
      }
    );
  }
}
