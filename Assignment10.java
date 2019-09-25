public class Assignment10 {
  public static void main(String[] args) {

    int[] firstExample = {1,5,7,2,0,2,6,4,0};
    System.out.print("ListOne unsorted:");
		printArray(firstExample);
    System.out.print("ListOne ascending order: ");
    printArray(bubbelSortDescending(firstExample));


  }

  private static int[] bubbelSortDescending(int[] arrayOfNumbers){
  boolean swapped = true;
  while(swapped){
    swapped = false;
    for(int i=0;i<=arrayOfNumbers.length-2;i++){
      if(arrayOfNumbers[i] > arrayOfNumbers[i+1]){
        //Swap list[i] and list[i+1]
        int temp = arrayOfNumbers[i+1];
        arrayOfNumbers[i+1] = arrayOfNumbers[i];
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
