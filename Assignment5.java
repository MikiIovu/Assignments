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
