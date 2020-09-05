/*Skriv en metod isAuthorised() som frågar användaren efter tre lösenord och som kontrollerar
om alla tre är korrekta. Returnerar boolean. Ordningen användaren matar in lösenorden i ska
inte spela någon roll - om lösenorden är “piggy”, “snuff” och “bark” så ska ordningen “snuff”,”bark”,”piggy” också accepteras.
Använd isAuthorised()-metoden i er main-metod och skriv ut en lämplig gratulationsfras ifall användaren lyckats mata in alla lösenorden korrekt.
Om användaren inte lyckades ska programmet låta henne försöka fyra gånger till, så att antalet totala inloggningsförsök man har på sig är fem.
Om användaren svarar fel på det femte försöket, ska programmet avslutas. Om användaren däremot svarade rätt på det femte försöket,
ska ett specialanpassat meddelande visas för att lugna användaren.*/

import java.util.Scanner;

public class Assignment5 {

   public static void main(String[] args) {
     for ( int i = 0; i < 5; i = i + 1) {
       if (isAuthorised()) {
         if (i <= 3) {
           System.out.println("Congratulations, correct password!");
         } else {
           System.out.println("You barely made it!");
         }
			   break;
       }
		 }
   }

   public static boolean isAuthorised() {
      System.out.println("Skriv in tre lösenord");
      Scanner s = new Scanner(System.in);
      String password1 = s.nextLine();
      String password2 = s.nextLine();
      String password3 = s.nextLine();
      String pwd1 = "piggy";
      String pwd2 = "snuff";
      String pwd3 = "bark";
      return (password1.equals(pwd1) && password2.equals(pwd2) && password3.equals(pwd3)
      || password1.equals(pwd1) && password2.equals(pwd3) && password3.equals(pwd2)
      || password1.equals(pwd2) && password2.equals(pwd1) && password3.equals(pwd3)
      || password1.equals(pwd2) && password2.equals(pwd3) && password3.equals(pwd1)
      || password1.equals(pwd3) && password2.equals(pwd1) && password3.equals(pwd2)
      || password1.equals(pwd3) && password2.equals(pwd2) && password3.equals(pwd1));

      }

}
