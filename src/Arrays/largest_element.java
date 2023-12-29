package Arrays;

class largest_element {
  public static void main(String[] args) {
    int[] arr = new int[] {2, 54, 21, 54, 87, 5, 4};
    int res = largestElement_efficient(arr);
    System.out.println("Here is the largest element " + res);
  }

  private static int largestElement_efficient(int[] arr) {
    int res = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[res]) res = i;
    }
    return arr[res];
  }

  private static int largestElement_naive(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean flag = true;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          flag = false;
          break;
        }
      }
      if (flag == true) return i;
    }
    return -1;
  }
}
