/*create human face by applet. */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class humanFace extends Applet {

  public void paint(Graphics g) {
    // Set background color
    setBackground(Color.WHITE);

    // Draw face outline
    g.setColor(Color.YELLOW);
    g.fillOval(100, 100, 200, 200);

    // Draw eyes
    g.setColor(Color.BLACK);
    g.fillOval(155, 175, 20, 20); // Left eye
    g.fillOval(225, 175, 20, 20); // Right eye

    // Draw nose
    g.setColor(Color.BLACK);
    g.drawLine(200, 195, 200, 225);

    // Draw mouth
    g.setColor(Color.BLACK);
    g.drawArc(150, 210, 100, 60, 180, 180);
  }
}
