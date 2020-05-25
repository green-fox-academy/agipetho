import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    int boxSize = 50;
    graphics.drawLine(WIDTH / 2 - boxSize / 2, HEIGHT / 2 - boxSize / 2, WIDTH / 2 + boxSize / 2, HEIGHT / 2 - boxSize / 2);//-
    graphics.setColor(new Color(234, 12, 35));
    graphics.drawLine(WIDTH / 2 - boxSize / 2, HEIGHT / 2 - boxSize / 2, WIDTH / 2 - boxSize / 2, HEIGHT / 2 + boxSize / 2);//le
    graphics.setColor(new Color(12, 230, 200));
    graphics.drawLine(WIDTH / 2 - boxSize / 2, HEIGHT / 2 + boxSize / 2, WIDTH / 2 + boxSize / 2, HEIGHT / 2 + boxSize / 2);
    graphics.setColor(new Color(23, 255, 0));
    graphics.drawLine(WIDTH / 2 + boxSize / 2, HEIGHT / 2 - boxSize / 2, WIDTH / 2 + boxSize / 2, HEIGHT / 2 + boxSize / 2);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
