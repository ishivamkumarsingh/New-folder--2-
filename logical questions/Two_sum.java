import java.util.*;

class Two_sum {
    void sum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " " + nums[j]);
                    
                }
            }
        }
        System.out.println("No valid pair found"); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your input");
            num[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        Two_sum ts = new Two_sum();
        ts.sum(num, target);
    }
}
