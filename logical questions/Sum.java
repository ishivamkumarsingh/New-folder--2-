import java.util.*;
public class Sum {
    public static void sum(int n, int m) {
        int sum = 0;
        for(int i=n;i<=m;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
        sum(n, m);
    }
}
