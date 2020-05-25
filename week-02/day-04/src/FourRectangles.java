import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphicsMain) {
    // draw four different size and color rectangles.
    // avoid code duplication.
    fourRectangles(150, 200, graphicsMain, 45);
  }

  public static void fourRectangles(int size, int size2, Graphics graphicsRect, int red) {

    for (int i = 0; i < 4; i++) {
      graphicsRect.setColor(new Color(red + (i * 60), 234, 12));
      graphicsRect.fillRect(50, 50, size, size2);
      size -= 20;
      size2 -= 20;
    }
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