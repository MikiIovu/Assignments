import java.util.*;

public class SimpleDiceGame {



  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int timesToPlay = 5;
    ArrayList<Player> listOfPlayers = init();

    for (int i = 0; i < timesToPlay; i++) {
      System.out.println("----------------");
      System.out.println("Round " + (i + 1));
      System.out.println("----------------");
      takeTurn(listOfPlayers);
    }

    System.out.println("The winner(s) is/are: " + getWinners(listOfPlayers));

  }

  private static int readInteger()  {
    while (true) {
      try {
        int number = input.nextInt();
        return number;
      } catch (Exception e) {
        System.out.println("Skriv ett giltigt heltal");
      }
    }
  }

  private static ArrayList<Player> init() {
      System.out.println("How many players should play the game?");
      int numberOfPlayers = readInteger();

      System.out.println("How many dice does each player have?");
      int numberOfDiceForPlayer = readInteger();

      System.out.println("How many sides do the dice have?");
      int numberOfSides = readInteger();

      ArrayList<Player> listOfPlayers = new ArrayList<Player>();

      for (int i = 0; i < numberOfPlayers; i++) {
        System.out.println("Write the name of player " + (i + 1));
        Player gamePlayer = new Player();
        Scanner nameInputScanner = new Scanner(System.in);
        String nameOfPlayer = nameInputScanner.nextLine();
        gamePlayer.setName(nameOfPlayer);
        for (int j = 0; j < numberOfDiceForPlayer; j++) {
          gamePlayer.addDie(numberOfSides);
        }
        listOfPlayers.add(gamePlayer);
      }

      return listOfPlayers;
    }


    public static void takeTurn(ArrayList<Player> players) {
      for(Player gamePlayer : players) {
        gamePlayer.rollDice();
        System.out.println();
        System.out.println("Player " + gamePlayer.getName() + " guess the number of your die");
        int guess = readInteger();
        if (guess == gamePlayer.getDieValue()) {
          gamePlayer.increaseScore();
          System.out.println("Congratulations "  + gamePlayer.getName() + " you guessed right ");
          System.out.println("Your score is " + gamePlayer.getPoints());
          System.out.println();
        } else {
          System.out.println("Sorry, you guessed wrong");
          System.out.println("The dice sum was equal to " + gamePlayer.getDieValue());
          System.out.println("Your score is " + gamePlayer.getPoints());
          System.out.println();

        }
      }

    }

    public static ArrayList<Player> getWinners(ArrayList<Player> players) {
      ArrayList<Player> winnersList = new ArrayList<Player>();
      int highscore = 0;
      for(Player gamePlayer : players) {
        if (gamePlayer.getPoints() > highscore) {
          winnersList.clear();
          winnersList.add(gamePlayer);
          highscore = gamePlayer.getPoints();
        } else if (gamePlayer.getPoints() == highscore) {
          winnersList.add(gamePlayer);
        }
      }
      return winnersList;
    }


     /*Die d1 = new Die (4);
    Die d2 = new Die (5);
    Player p1 = new Player();
    Player p2 = new Player();
    p1.setName ("jojo");
    p1.setPoints(2);
    //System.out.println(p1.getPoints());
    p1.rollDice();

    p1.increaseScore();
    p1.addDie(6);
    p1.addDie(8);
    p2.addDie(4);

    d1.roll();
    d2.roll();
    System.out.println(d1.getCurrentValue());
    System.out.println(d2.getCurrentValue());
    p1.rollDice();
    d2.roll();

    System.out.println(p1.getName());
    System.out.println(p1.getDieValue());
    System.out.println(p1.getPoints());
    */


}
