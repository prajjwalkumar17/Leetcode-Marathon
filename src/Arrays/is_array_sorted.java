package Arrays;

public class is_array_sorted {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,14};
    boolean res  = is_sorted_efficient(arr);
    System.out.println("sorted: "+res);
  }

  public static boolean is_sorted_efficient(int[] arr) {
    for(int i = 0 ; i<arr.length-1; i++)
      if(arr[i+1] < arr[i])
        return false;
    return true;
  }

  public static boolean is_sorted_naive(int[] arr) {
    for(int i = 0 ; i < arr.length; i++)
      for(int j = i+1; j<arr.length; j++)
        if(arr[i] > arr[j])
          return false;
    return true;
  }
}
