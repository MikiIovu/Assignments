/*Nu ska ni skriva ett program som låter användaren mata in strängar. Programmet ska fortsätta
fråga efter nya strängar så länge strängarna blir längre och längre, dvs så länge varje sträng har
fler tecken i sig än den föregående. Om en sträng med lika många eller färre tecken matas in
ska programmet sluta fråga efter strängar, skriva ut alla som hittills har matats in, och till slut
avslutas.*/

import java.util.*;

public class Assignment9 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    List<String> listOfWords = new ArrayList<String>();
    System.out.println("Write a word");
    String usersWord = input.nextLine();
    listOfWords.add(usersWord);
    String previousWord = usersWord;

    while (true) {
      System.out.println("Write a word");
      String newWord = input.nextLine();

      boolean b = isWordShorter(newWord, previousWord);
      if (b) {
        break;
      }
      listOfWords.add(newWord);
      System.out.println("Debug: previousWord = " + previousWord + " newWord = " + newWord);
      previousWord = newWord;
    }

    System.out.println(listOfWords);
  }


  public static boolean isWordShorter(String newWord, String previousWord) {
    return (newWord.length() <= previousWord.length());
  }

}
