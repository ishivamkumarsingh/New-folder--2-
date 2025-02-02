import java.util.*;
public class Qstr {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2="HEllo World";
        String s3 = new String("Hello World");
       /*  
       System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("Hello"));
        System.out.println(s1.indexOf("World"));
        System.out.println(s1.lastIndexOf("Hello"));
        System.out.println(s1.lastIndexOf("World"));
        System.out.println(s1.contains("Hello"));
        System.out.println(s1.contains("World"));
        System.out.println(s1.replace("Hello", "Hi"));
       
        System.out.println(s1.replace("World", "Universe"));
         */
        System.out.println(s1.concat(s3));

    }
    
}
