package Arrays;


public class duplicate_remover {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 3, 3, 4, 4, 4};
    int res = remove_duplicates_efficient(arr);
    System.out.println("The size of the resultant array is: "+res);
  }
  public static int remove_duplicates_efficient(int[] arr) {
    int res = 1;
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] != arr[res-1]) {
        arr[res] = arr[i];
        res++;
      }
    }
    return res;
  }

  public static int remove_duplicates_naive(int[] arr) {
    int[] temp = new int[arr.length];
    temp[0] = arr[0];
    int res = 1;
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] != temp[res-1]) {
        temp[res] = arr[i];
        res++;
      }
    }
    return res;
  }
}
