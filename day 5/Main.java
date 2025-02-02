interface CheckEmpty {
    boolean check(String str);
}

public class Main {
    public static void main(String[] args) {
        CheckEmpty isEmpty = str ->(str) == null || str.isEmpty();

        String test1 = "ui";
        System.out.println(isEmpty.check(test1));

        
       
    }
}
