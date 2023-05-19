import java.awt.*;

class awt_test extends Frame {

  awt_test() {
    Frame f = new Frame("Button Example");
    Button b = new Button("click here");
    b.setBounds(30, 100, 80, 30);
    f.add(b);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
    //********************************/

    Frame f1 = new Frame("Checkbox Example");
    Checkbox checkbox1 = new Checkbox("C++");
    checkbox1.setBounds(100, 100, 50, 50);
    Checkbox checkbox2 = new Checkbox("Java", true);
    // setting location of checkbox in frame
    checkbox2.setBounds(100, 150, 50, 50);
    // adding checkboxes to frame
    f1.add(checkbox1);
    f1.add(checkbox2);

    // setting size, layout and visibility of frame
    f1.setSize(400, 400);
    f1.setLayout(null);
    f1.setVisible(true);

    //*****************************************/

    // creating a frame
    Frame f2 = new Frame();
    // creating a text area
    TextArea area = new TextArea("Welcome to page");
    // setting location of text area in frame
    area.setBounds(10, 30, 300, 300);
    // adding text area to frame
    f2.add(area);
    // setting size, layout and visibility of frame
    f2.setSize(400, 400);
    f2.setLayout(null);
    f2.setVisible(true);
  }
}

public class button {

  public static void main(String[] args) {
    new awt_test();
  }
}
