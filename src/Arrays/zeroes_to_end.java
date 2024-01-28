package Arrays;

import java.util.Arrays;

/** zeroes_to_end */
public class zeroes_to_end {

  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 3, 0, 4, 0, 21};
    int[] res = moveZeroesNaive(arr);
    System.out.println("The array with all the zeroes on right is: " + Arrays.toString(res));
  }

  private static int[] moveZeroesEfficient(int[] arr) {
    // guard clause
    if (arr.length == 1) return arr;

    // Managing for non 0 integers
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[count] = arr[i];
        count++;
      }
    }

    // Managing for 0
    while (count < arr.length) {
      arr[count] = 0;
      count++;
    }
    return arr;
  }

  private static int[] moveZeroesNaive(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] != 0) {
            swap(arr, i, j);
            break;
          }
        }
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
