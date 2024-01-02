package Arrays;

public class sorted_or_not {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,15,1};
    boolean res = is_sorted(arr);
    System.out.println("sorted: "+ res);
  }
  public static boolean is_sorted(int[] arr) {
    for(int i=0; i<arr.length; i++)
      for(int j = i+1; j< arr.length; j++)
        if(arr[i] > arr[j])
          return false;
    return true;
  }
}
