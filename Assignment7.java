public class Assignment7 {
  public static void main (String[] args) {
    boolean myExample = anyIsTrue (true, false, true, false);
    boolean mySecondExample = allAreFalse (true, true, true, true);
    System.out.println(myExample);
    System.out.println(mySecondExample);

  }

  public static boolean anyIsTrue (boolean firstArg, boolean secondArg, boolean thirdArg, boolean fourthArg) {
    return (firstArg || secondArg || thirdArg || fourthArg);
  }

  public static boolean allAreFalse (boolean firstArg, boolean secondArg, boolean thirdArg, boolean fourthArg) {
    return anyIsTrue(firstArg, secondArg, thirdArg, fourthArg) == false;

/*
    if ((firstArg == false) && (secondArg == false) && (thirdArg == false) && (fourthArg ==false)) {
      return true;
    } else {
      return false;
    }
*/
  }

}
