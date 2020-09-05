import java.util.*;

public class FourGame {

  private static Scanner input = new Scanner(System.in);
  private static Board board;
  private static int width;
  private static int height;


  public static void main(String[] args)  {



    System.out.println("Write number of rows");
    height = readInteger();
    System.out.println("Write number of columns");
    width = readInteger();

    board = new Board(width, height);


    for (int turn = 0; turn < width * height; turn++) {
      char player;

      if (turn % 2 == 0) {
        player = 'x';
      } else {
        player = 'o';
      }

      takeTurn(player);
      if (Checker.checkIfWinner(player, board)) {
        System.out.println("Congratulations! Player with symbol '" + player + "' won! The final state is:");
        board.show();
        return;
      }
    }

    System.out.println("There are no free spaces left! It's a tie. The final situation is:");
    board.show();
  }


  private static void takeTurn(char piece) {
    System.out.println("Player with symbol '" + piece + "'. The current situation is:");
    board.show();

    while (true) {
      int givenColumn = askUserForColumnBetweenOneAndAGivenNumber(board.getWidth());
      // I don't expect the user to give 0 indexed column names so I will just subtract whatever value they entered
      boolean pieceWasSuccessfullyPlaced = board.dropPiece(piece, givenColumn - 1);

      if (pieceWasSuccessfullyPlaced) {
        return;
      } else
        System.out.println("The given column was full. Enter a column with free spaces");
    }
  }

  private static int askUserForColumnBetweenOneAndAGivenNumber(int maxNumber) {
    System.out.println("Enter a column you want to put your piece (a value between 1 and " + maxNumber + ")");

    while (true) {
      int givenNumber = readInteger();

      // If given number is within range we will return it (and break the loop which otherwise will run forever)
      if (givenNumber >= 1 && givenNumber <= maxNumber) {
        return givenNumber;
      } else {
        System.out.println("The given value was not within the specificed range (1-" + maxNumber + "). Try again");
      }
    }
  }


  private static int readInteger()  {
    while (true) {
      String givenNumber = input.nextLine();
      try {
        int number = Integer.parseInt(givenNumber);
        return number;
      } catch (Exception e) {
        System.out.println("Write a valid number");
      }
    }
  }


}
