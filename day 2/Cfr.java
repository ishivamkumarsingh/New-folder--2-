import java.util.Scanner;
import java.util.Arrays;
public class Cfr {
    public static void main(String[] args) 
    {  int sum =0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) 
        {
          arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
          sum=sum+arr[i];
        }
        }
        System.out.println(sum);
    }
