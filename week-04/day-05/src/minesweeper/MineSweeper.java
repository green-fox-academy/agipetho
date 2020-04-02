package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MineSweeper extends JComponent implements MouseListener {

  private static final int CANVAS_SIZE = 800;
  private static final int IMAGE_SIZE = 40;

  private static int leftInset;
  private static int topInset;

  private Resource resource;
  private Grid grid;

  public MineSweeper() {
    this.resource = new Resource();
    this.grid = new Grid(CANVAS_SIZE / IMAGE_SIZE);

    // set the size of your draw board
    setPreferredSize(new Dimension(CANVAS_SIZE, CANVAS_SIZE));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    this.grid.draw(graphics, resource, IMAGE_SIZE);
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("Minesweeper");
    MineSweeper mineSweeper = new MineSweeper();
    frame.add(mineSweeper);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();

    topInset = frame.getInsets().top;
    leftInset = frame.getInsets().left;

    frame.addMouseListener(mineSweeper);

  }

  @Override
  public void mouseClicked(MouseEvent e) {

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {
    //System.out.println(((e.getX() - leftInset) / IMAGE_SIZE + 1) + " " + ((e.getY() - topInset) / IMAGE_SIZE + 1));
    this.grid.handleClick(((e.getX() - leftInset) / IMAGE_SIZE + 1), ((e.getY() - topInset) / IMAGE_SIZE + 1));

    if(grid.getGameState().equals("lose")){
      grid.revealAll();
    }

    repaint();
  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }
}
