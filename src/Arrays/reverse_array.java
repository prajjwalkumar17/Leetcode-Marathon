package Arrays;

import java.util.Arrays;

/** reverse_array */
public class reverse_array {

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 4, 16, 10};
    int[] res = array_reverse(arr);
    System.out.println(Arrays.toString(res));
  }

  public static int[] array_reverse(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      // swap logic
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;

      // increment logic
      low++;
      high--;
    }
    return arr;
  }
}
