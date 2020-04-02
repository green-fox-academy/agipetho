package minesweeper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Resource {
  private HashMap<FieldType, BufferedImage> images;

  public Resource() {
    images = new HashMap<>();
    images.put(FieldType.ONE, loadImage("1.png"));
    images.put(FieldType.TWO, loadImage("2.png"));
    images.put(FieldType.THREE, loadImage("3.png"));
    images.put(FieldType.FOUR, loadImage("4.png"));
    images.put(FieldType.FIVE, loadImage("5.png"));
    images.put(FieldType.SIX, loadImage("6.png"));
    images.put(FieldType.SEVEN, loadImage("7.png"));
    images.put(FieldType.EIGHT, loadImage("8.png"));
    images.put(FieldType.MINE, loadImage("mine.png"));
    images.put(FieldType.REVEALED, loadImage("revealed.png"));
    images.put(FieldType.UNREVEALED, loadImage("unrevealed.png"));
  }

  private BufferedImage loadImage(String filename){
    try {
      return ImageIO.read(new File("images/" + filename));
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    return null;
  }

  public BufferedImage getImage(FieldType fieldType){
    return images.get(fieldType);
  }
}
