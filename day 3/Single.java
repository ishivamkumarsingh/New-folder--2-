import java.util.*;

class A {
   void abc() {
    System.out.println("This is a");
   }
}

class B extends A {
    void xyz() {

        System.out.println("This is b");
        
    }
}

public class Single {
    public static void main(String[] args) {
        B b = new B();
        
        b.abc();
        b.xyz();
    }
}