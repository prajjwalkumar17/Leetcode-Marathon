package Arrays;

public class second_largest {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 5, 17, 25, 24};
    int res = second_largest_efficient(arr);
    System.out.println(" The second largest element is: " + arr[res]);
  }

  public static int second_largest_naive(int[] arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[largest]) largest = i;
    }

    int second_largest = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != arr[largest]) {
        if (second_largest == -1 || arr[second_largest] < arr[i]) second_largest = i;
      }
    }
    return second_largest;
  }

  public static int second_largest_efficient(int[] arr) {
    int second_largest = -1;
    int largest = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[largest]) {
        second_largest = largest;
        largest = i;
      } else {
        if (second_largest == -1 || arr[second_largest] < arr[i]) second_largest = i;
      }
    }
    return second_largest;
  }
}
