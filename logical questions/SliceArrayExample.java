import java.util.*;

class SliceArrayExample {
    int[] sliceArray(int[] array, int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element");
            array[i] = sc.nextInt();
        }
        System.out.println("enter start ");
        int start = sc.nextInt();
        System.out.println("enter end ");
        int end = sc.nextInt();
        SliceArrayExample obj = new SliceArrayExample();
        int[] sliced = obj.sliceArray(array, start, end);
        System.out.println(Arrays.toString(sliced));
    }
}
