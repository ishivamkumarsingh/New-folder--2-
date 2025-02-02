import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the string:"+ i+1);
            String str = sc.next();
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            System.out.println(frequencyMap.getOrDefault(query, 0));
        }
      sc.close();
    }
}