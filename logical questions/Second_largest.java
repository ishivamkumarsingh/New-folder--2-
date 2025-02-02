import java.util.*;

public class Second_largest {

    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                s_max = max; 
                max = arr[i]; 
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i]; 
            }
        }

        if (s_max == Integer.MIN_VALUE) {
            System.out.println("No");
        } else {
            System.out.println( s_max);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 20, 14, 56, 83};
        secondLargest(arr);
        
       
    }
}
