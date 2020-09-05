/*Skriv ett program som kontinuerligt hämtar en textsträng från användaren och skriver ut den på
skärmen. Programmet ska fråga om och om igen, fram tills dess att användaren skriver in
samma sak två gånger i rad. Då ska programmet avslutas.*/

import java.util.*;

public class Assignment3 {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    List <String> listOfWords = new ArrayList <String> ();

    while (true) {
      System.out.println("Write a word");
      String usersWord = input.nextLine();
      boolean b = isInList(listOfWords,usersWord);
      if (b) {
        break;
      } else {
        listOfWords.add(usersWord);
      }

    }
  }

  public static boolean isInList(List<String> listOfWords, String word) {
    for (String wordInList : listOfWords) {
      if (word.equals(wordInList)) {
        return true;
      }
    }
    return false;

  }
}
