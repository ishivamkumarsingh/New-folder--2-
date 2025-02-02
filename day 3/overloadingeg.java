public class overloadingeg 
{
    public static void sum(String a, String b)
        {
            System.out.println("Sum of two integers is " + (a + b));
    }
    public static void sum(int a, int b, int c)
    {
        System.out.println("Sum of three integers is " + (a + b + c));
    }
  
    public static void sum(int a,double b)
    {
        System.out.println("Sum of two integers is " + (a + b));
    }
    public static void sum(string a, string b)
    {
        System.out.println("Sum of two characters is " + a+b);
    }
    public static void main(String args[])
    {
        sum(1, 3.20);
        sum("rbtbb","rbtbb");
    }
}
