package minesweeper;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Grid {

  private ArrayList<ArrayList<Field>> grid;
  private String gameState = "progress";

  public Grid(int size) {
    this.grid = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < size + 2; i++) {
      ArrayList<Field> row = new ArrayList<>();
      for (int j = 0; j < size + 2; j++) {

        FieldType fieldType = FieldType.UNREVEALED;
        boolean isMine = false;
        if(i == 0 || j == 0 || i == size + 1 || j == size + 1){
          fieldType = FieldType.REVEALED;
        }else{
          isMine = random.nextInt(10) == 0;
        }

        Field field = new Field(i, j, fieldType, isMine);
        row.add(field);
      }

      this.grid.add(row);
    }

    System.out.println("hello");
  }

  private int countNeighbourMines(int row, int column){
    int counter = 0;
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        if(this.grid.get(row + i).get(column + j).isMine()){
          ++counter;
        }
      }
    }

    return counter;
  }

  public void revealAll(){
    for (int i = 1; i < this.grid.size() - 1 ; i++) {
      for (int j = 1; j < this.grid.get(i).size() - 1; j++) {
        reveal(i, j);
      }

    }
  }

  private void reveal(int row, int column){

    if(this.grid.get(row).get(column).isMine()){
      this.grid.get(row).get(column).setFieldType(FieldType.MINE);
      gameState = "lose";
    }else{
      int numberOfMines = countNeighbourMines(row, column);
      if (numberOfMines == 0){
        this.grid.get(row).get(column).setFieldType(FieldType.REVEALED);

        for (int i = -1; i <= 1; i++) {
          for (int j = -1; j <= 1; j++) {
            if(this.grid.get(row + i).get(column + j).getFieldType() == FieldType.UNREVEALED){
              reveal(row + i, column + j);
            }
          }
        }

      }else{
        System.out.println(numberOfMines);
        this.grid.get(row).get(column).setFieldType(FieldType.values()[numberOfMines - 1]);
      }
    }
  }

  public String getGameState(){
    return gameState;
  }

  public void handleClick(int row, int column){
    reveal(row, column);
  }

  public void draw(Graphics graphics, Resource resource, int imageSize){
    for (int i = 1; i < this.grid.size() - 1 ; i++) {
      for (int j = 1; j < this.grid.get(i).size() - 1; j++) {
        this.grid.get(i).get(j).draw(graphics, resource, imageSize);
      }

    }
  }
}
