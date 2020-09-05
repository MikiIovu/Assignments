import java.util.*;

public class Die {
  private int numberOfSides;
  private int currentValue;
  private static Random randomizer = new Random();

  public Die(int nrOfSides) {
    numberOfSides = nrOfSides;
  }

  public int getNumerOfSides() {
    return numberOfSides;
  }

  public int getCurrentValue() {
    return currentValue;
  }

  public void roll() {
    int randomNumber = randomizer.nextInt(numberOfSides) + 1;
    currentValue = randomNumber;
  }


}
