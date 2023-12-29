package Arrays;

public class two_sum {
  // PROBLEM LINK
  // https://leetcode.com/problems/two-sum
  /* Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
  public static void main(String[] args) {
    int[] a = {3, 2, 4};
    int target = 6;
    int b[] = twoSum(a, target);
    System.out.println("i = " + b[0] + ", j = " + b[1]);
  }

  // TODO BRUTE FORCE O(n^2)
  //    private static int[] twoSum(int[] a, int target) {
  //        int n = a.length;
  //        for(int i = 0; i < n; i++) {
  //            for (int j = 0; j < n; j++) {
  //                if (i == j) continue;
  //                if (a[i] + a[j] == target) {
  //                    int[] res = new int[2];
  //                    res[0] = i;
  //                    res[1] = j;
  //                    return res;
  //                }
  //            }
  //        }
  //        int[] b = new int[2];
  //        Arrays.fill(b,-1);
  //        return b;
  //    }
  // TODO BRUTE FORCE OPTIMIZED CODE
  //    private static int[] twoSum(int[] a, int target) {
  //        for(int i = 0; i < a.length; i++)
  //            for (int j = 0; j < a.length; j++) {
  //                if (i == j) continue;
  //                if (a[i] + a[j] == target)
  //                    return new int[]{i,j};
  //            }
  //        return new int[]{-1, -1};
  //    }

  // TODO BRUTE FORCE WITH LESS RUNS O(n^2)
  //    private static int[] twoSum(int[] a, int target) {
  //        for(int i = 0; i < a.length -1 ; i++)
  //            for (int j = i+1; j < a.length; j++) {
  //                if (a[i] + a[j] == target)
  //                    return new int[]{i,j};
  //            }
  //        return new int[]{-1, -1};
  //    }

  // TODO HASHING O(nlogn)
  //    private static int[] twoSum(int[] a, int target) {
  //        HashMap<Integer, Integer> map = new HashMap<>();
  //        for(int i = 0; i < a.length; i++) {
  //            if (map.containsKey(target - a[i]))
  //                return new int[]{map.get(target - a[i]), i};
  //            map.put(a[i], i);
  //        }
  //        return new int[]{-1, -1};
  //    }

  // TODO 2 POINTER O(n^2)
  private static int[] twoSum(int[] a, int target) {
    int start = 0;
    int end = a.length - 1;
    while (start < end) {
      int sum = a[start] + a[end];
      if (sum == target) return new int[] {start, end};
      else if (sum > target) end--;
      else start++;
    }
    return new int[] {-1, -1};
  }
}
