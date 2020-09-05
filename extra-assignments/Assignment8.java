/*Skriv en metod som tar genomsnittet av alla tal i en array och returnerar det. Skriv ett
testprogram.
Tips: metodens argument ska vara en array av doubles och den ska returnera en double.*/

public class Assignment8 {
  public static void main(String[] args) {

    double numbers [] = {1,2,3,4,5,6,7,8,9,10};
    double theExample = meanOfNumbers(numbers);
    System.out.println(theExample);
  }

  public static double meanOfNumbers(double [] numbers) {
    double sum = 0;

    for (int i = 0; i < numbers.length; i++ ) {
      sum = sum + numbers[i];
    }

    double mean = sum / numbers.length;
    return mean;

  }
}
