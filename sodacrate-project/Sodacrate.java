import java.util.Scanner;

public class Sodacrate {
  int maxNumberOfBottles = 25;
  Soda[] crate = new Soda[maxNumberOfBottles];
  private int numberOfBottles = 0;


  private static int readInteger()  {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        int number = input.nextInt();
        return number;
      } catch (Exception e) {
        System.out.println("Skriv ett giltigt heltal");
      }
    }
  }

    public void Run()  {
      System.out.println("Welcome to the awesome Sodacrate-simulator");
      while (true) {
        System.out.println("1.Lägg till en flaska");
        System.out.println("2.Skriv ut innehåll på läskbacken");
        System.out.println("3.Beräkna läskbackens värde");
        System.out.println("4.Sök flaska efter namn");
        System.out.println("5.Sortera läskbacken");
        System.out.println("6.Avsluta programmet");

        int choice = readInteger();
        switch (choice) {
          case 1:
            add_soda();
            break;
          case 2:
            print_crate();
            break;
          case 3:
            calc_total();
            break;
          case 4:
            find_soda();
            break;
          case 5:
            sort_soda();
            break;
          case 6:
            return;
          default:
            System.out.println("Skriv ett nummer mellan 1 och 6");
            break;
          }
          System.out.println();
            }
        }

        public void add_soda() {
          if (numberOfBottles == maxNumberOfBottles)  {
            System.out.println("Backen är full");
            int index;
            do {
              System.out.println("Skriv in ett index mellan 0 och " + (maxNumberOfBottles - 1) + " som du vill ersätta");
              index = readInteger();
              } while (index < 0 || index > (maxNumberOfBottles - 1));

              numberOfBottles--;
              add_soda_at_position(index);
            }
            else
            {
              add_soda_at_position(numberOfBottles);
            }
        }
        public void add_soda_at_position(int position) {
          System.out.println("Skriv in ett namn på läsken");
          Scanner p = new Scanner(System.in);
          String name  = p.nextLine();
          System.out.println("Skriv in ett pris på läsken");
          int price = readInteger();
          System.out.println("Välj läsktyp:");
          System.out.println("1. Läsk");
          System.out.println("2. Vatten");
          System.out.println("3. Öl");
          System.out.println("4. Energidryck");

          String type = null;

          do {
            int choice = readInteger();
            switch(choice) {
              case 1:
                type = "läsk";
                break;
              case 2:
                type = "vatten";
                break;
              case 3:
                type = "öl";
                break;
              case 4:
                type = "energidryck";
                break;
              default:
                System.out.println("Skriv ett nummer mellan 1 och 4");
                break;
            }
            } while (type == null);

            Soda newSoda = new Soda(name, price, type);

            crate[position] = newSoda;
            numberOfBottles++;
        }

        public void print_crate() {
          for (Soda soda : crate) {
            if (soda != null) {
              soda.printSoda();
              System.out.println("---");
            } else {
                System.out.println("Tom plats");
                System.out.println("---");
                }
            }
        }

        public void calc_total()  {
          int sum = 0;
          for (Soda soda : crate)  {
            if (soda != null) {
              int price = soda.getPrice();
              sum = price + sum;
            }
            }
            System.out.println("Värden av läskbacken är: " + sum);
        }

        public void find_soda() {
          System.out.println("Skriv in drycken du vill söka");
          boolean sodaFound = false;
          Scanner inp = new Scanner(System.in);
          String searchedSoda = inp.nextLine();
          String lowerCaseSearchedSoda = searchedSoda.toLowerCase();

          for (var i = 0; i < numberOfBottles; i++) {
            String lowerCaseName = crate[i].getName().toLowerCase();
            if (lowerCaseName.equals(lowerCaseSearchedSoda))  {
              crate[i].printSoda();
              System.out.println("---");
              sodaFound = true;
              }
            }

            if (sodaFound == false) {
              System.out.println("Drycken finns inte i backen");
            }
        }

        public void sort_soda() {
		        boolean swapped = true;
		        while(swapped) {
              swapped = false;
			        for (var i = 0; i <= numberOfBottles - 2; i++){
                String lowerCaseNameFirst = crate[i].getName().toLowerCase();
                String lowerCaseNameSecond = crate[i+1].getName().toLowerCase();
                if (lowerCaseNameFirst.compareTo(lowerCaseNameSecond) > 0) {
                 var temp = crate[i+1];
					       crate[i+1] = crate[i];
					       crate[i] = temp;

					       swapped = true;

				         }
			        }

		         }
             print_crate();

        }
}
