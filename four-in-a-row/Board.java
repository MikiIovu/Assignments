public class Board {

  private int width;
  private int height;
  private char[][] grid;

  public Board(int width, int height) {

    this.width = width;
    this.height = height;
    grid = new char[width][height];
    clearBoard();

  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }


  public char get(int column, int row) {
    return grid[column][row];
  }

  public void set(int column, int row, char piece) {
    grid[column][row] = piece;

  }


  public void show() {
    System.out.println(" + " + " ----------------------------- " + " + ");
    for (int row = 0; row < height; row++) {
      System.out.print(" | ");
      for (int column = 0; column < width; column++) {
        System.out.print(get(column, row));
        System.out.print(" | ");
      }
      System.out.println();

    }

    System.out.println(" + " + " ------------------------------ " + " + ");

  }

  public void clearBoard() {
    for (int row = 0; row < height; row++) {
      for (int column = 0; column < width; column++) {
        clear(column,row);
      }
    }

  }

  public void clear(int column, int row) {
    set(column, row, ' ');
  }


  private boolean isEmpty(int column, int row) {
    return get(column, row) == ' ';
  }

  public boolean dropPiece(char piece, int column) {
    for (int row = height - 1; row >= 0; row--) {
      if (isEmpty(column, row)) {
        set(column, row, piece);
        return true;
      }
    }
    return false;
  }
}
