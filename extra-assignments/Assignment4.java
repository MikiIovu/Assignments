/*Skriv ett program som frågar användaren efter två tal och som sedan beräknar medelvärdet av
dem. Dela upp programmet i två metoder: en som hämtar en integer från användaren, och en
som beräknar medelvärdet av två tal. Anropa dessa metoder på lämpliga sätt.*/

import java.util.Scanner;

public class Assignment4 {
  public static void main(String[] args) {
    System.out.println("Write two numbers");
    int choice = askForNumber();
    int choiceTwo = askForNumber();
    double mean;
    double myExample = meanOfNumbers(choice, choiceTwo);
    System.out.println(myExample);
  }

  private static int askForNumber()  {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        int number = input.nextInt();
        return number;
      } catch (Exception e) {
        System.out.println("Write valid number");
      }
    }
  }

  public static double meanOfNumbers(double numberOne, double numberTwo) {
    double mean = (numberOne + numberTwo) / 2;
    return mean;

  }
}
