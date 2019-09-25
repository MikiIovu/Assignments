public class Assignment6 {
  public static void main (String[] args) {
    System.out.println(anyIsTrue(true, false, true, false));
    /*
    boolean myExample = anyIsTrue(true, false, true, false);
    System.out.println(myExample);
*/
  }

  public static boolean anyIsTrue (boolean firstArg, boolean secondArg, boolean thirdArg, boolean fourthArg) {
    return (firstArg || secondArg || thirdArg || fourthArg);
  }

}
