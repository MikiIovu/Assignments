/*Skriv en metod isEven() som kontrollerar om ett givet tal är jämnt eller inte. Den ska returnera
en boolean. Skriv sedan ett testprogram som består av att ni anropar metoden ett par gånger
med olika indata, för att se till så att den funkar ordentligt.*/


public class Assignment1 {
  public static void main(String[] args) {
    boolean myNumber = isEven(10);
    System.out.println(myNumber);
  }

  public static boolean isEven(int usersNumber) {
    return (usersNumber % 2 == 0);
  }
}
