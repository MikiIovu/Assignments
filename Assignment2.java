import java.util.Scanner;

public class Assignment2 {
  public static void main (String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Write a number between 0 and 10");
    int myNumber;

    do {
      myNumber = userInput.nextInt();
      if (myNumber >= 0 && myNumber < 10) {
        break;
      }
      System.out.println("Try again");
    } while (true);
    System.out.println("Congrats, you made it!");

  }
}
