/*Write a program with two different methods: A method, createArray(int x) that returns an array with all values from
1 to x. A method, printArray(int[] arr) that will print an array on the format “[1,2,3]”.
One more method, doubleUpArray(int[] arr) that will return a new array with twice as many slots. What was in the original array should be
in the first half of the new array.*/

public class ArrayExercise {
  public static void main(String[] args) {

    int[] myExample = createArray(20);
    printArray(myExample);
    int[] doubleArr = doubleUpArray(myExample);
    printArray(doubleArr);

  }

  public static int[] createArray(int x) {
    int[] arrayOfNumbers = new int[x];
    for (int i = 0; i < arrayOfNumbers.length; i++) {
      arrayOfNumbers[i] = i+1;
    }
    return arrayOfNumbers;
  }

  public static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }

  public static int[] doubleUpArray(int[] arr) {
    int size = arr.length * 2;
    int[] doubleArr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      doubleArr[i] = arr[i];
    }

    return doubleArr;
  }

}
