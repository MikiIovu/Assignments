public class Checker {

  public static boolean checkIfWinner(char symbol, Board board) {
    // The player wins if any of the checks return true.
    return checkRows(symbol, board) || checkColumns(symbol, board);
  }

  public static boolean checkRows(char symbol, Board board ) {

    for (int row = 0; row < board.getHeight(); row++) {
      int foundInARow = 0;
      for (int col = 0; col < board.getWidth(); col++) {
        if (board.get(col, row) == symbol) {
          foundInARow++;
          if ( foundInARow == 4) {
            return true;
          }
        } else {
          foundInARow = 0;
        }
      }
    }

    return false;
  }

  public static boolean checkColumns(char symbol, Board board ) {

    for (int col = 0; col < board.getWidth(); col++) {
      int foundInARow = 0;
      for (int row = 0; row < board.getHeight(); row++) {
        if (board.get(col, row) == symbol) {
          foundInARow++;
          if ( foundInARow == 4) {
            return true;
          }
        } else {
          foundInARow = 0;
        }
      }
    }

    return false;
  }
}
