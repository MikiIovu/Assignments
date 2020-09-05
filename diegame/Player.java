import java.util.*;

public class Player {
  private String name;
  private int points = 0;
  private ArrayList<Die> listOfDice = new ArrayList<Die>();

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public int getPoints() {
    return points;
  }


  public void rollDice() {
    for (Die playerDice : listOfDice) {
      playerDice.roll();
    }

  }

  public int getDieValue() {
    int sum = 0;
    for (Die playerDice : listOfDice) {
      int value = playerDice.getCurrentValue();
      sum = sum + value;
    }
    return sum;
  }


  public void increaseScore()  {
    points = points + 1;
  }


  public void addDie(int sides) {
    Die newDie = new Die(sides);
    listOfDice.add(newDie);
  }

 public String toString() {
   return ("player " + name + " who has " + points + " points");
 }

}
