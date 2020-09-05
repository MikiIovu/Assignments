public class Soda  {
  private String name;
  private int price;
  private String type;

  public String getName() {
    return name;
    }
  public int getPrice() {
    return price;
    }

  public String getType() {
    return type;
    }

  public Soda(String name, int price, String type)  {
    this.name = name;
    this.price = price;
    this.type = type;
  }

  public void printSoda() {
    System.out.println("namn: " + name);
    System.out.println("pris: " + price);
    System.out.println("typ:  " + type);
    }
    }
