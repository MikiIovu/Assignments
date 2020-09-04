/*Uökning av förra uppgiften.
Skriv nu en metod som tar emot en array av heltal, sorterar den med hjälp av Comb sort, och
returnerar den sorterade arrayen.*/

public class Assignment11 {
  public static void main(String[] args) {
    int[] firstExample = {1,5,7,2,0,2,6,4,0};
    System.out.print("ListOne unsorted:");
		printArray(firstExample);
    System.out.print("ListOne sorted: ");
    printArray(combSort(firstExample));
  }

  public static int[] combSort(int[] arrayOfNumbers) {
    int gap = arrayOfNumbers.length;
    boolean swapped = true;
    while(gap != 1 || swapped) {
      swapped = false;
      gap = (int) (gap/1.3);
      if (gap <= 1) {
        gap = 1;
      }

      for(int i = 0; i < arrayOfNumbers.length - gap; i++){
        if(arrayOfNumbers[i] > arrayOfNumbers[i+gap]){
          int temp = arrayOfNumbers[i+gap];
          arrayOfNumbers[i+gap] = arrayOfNumbers[i];
          arrayOfNumbers[i] = temp;
          swapped = true;
        }
       }
      }

      return arrayOfNumbers;
    }

    private static void printArray(int[] arr ) {
      System.out.print("[");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
          System.out.print(",");
        }
      }
      System.out.println("]");
    }
}
