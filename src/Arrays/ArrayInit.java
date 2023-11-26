package Arrays;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {1,2,3,4,5,5};
        char[] alpha = new char[5];

        Arrays.fill(a, 3);
        for(int i=0; i<a.length; i++){
            System.out.println("index: "+i+"element: "+a[i]);
        }
    }
}
