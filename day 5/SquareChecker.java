import java.util.Scanner;

interface PerfectSquareLambda {
    boolean check(int n);
}

public class SquareChecker {
    public static void main(String[] args) {
        PerfectSquareLambda isPerfectSquare = (n) -> {
            if (n < 0) return false;
            int i = 0;
            while (i * i <= n) {
                if (i * i == n) return true;
                i++;
            }
            return false;
        };
      
        System.out.println(isPerfectSquare.check(16));
        
    }
}