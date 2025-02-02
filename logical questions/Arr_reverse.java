import java.util.Arrays;

public class Arr_reverse {

    public static int[] reverseDigits(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            int num = inputArray[i];
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            resultArray[i] = reversed;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {123, 456, 789, 101};
        int[] reversedArray = reverseDigits(inputArray);
        System.out.println( Arrays.toString(reversedArray));
    }
}
