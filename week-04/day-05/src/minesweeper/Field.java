package minesweeper;

import java.awt.*;

public class Field {

  private int row;
  private int column;
  private FieldType fieldType;
  private boolean isMine;

  public Field(int row, int column, FieldType fieldType, boolean isMine) {
    this.row = row;
    this.column = column;
    this.fieldType = fieldType;
    this.isMine = isMine;
  }

  public boolean isMine() {
    return isMine;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }

  public FieldType getFieldType() {
    return fieldType;
  }

  public void draw(Graphics graphics, Resource resource, int imageSize){
    graphics.drawImage(resource.getImage(this.fieldType),
        row * imageSize - imageSize,
        column * imageSize - imageSize, null);
  }
}
