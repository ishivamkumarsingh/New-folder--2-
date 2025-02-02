import java.util.*;

class A {
   void abc() {
    System.out.println("This is a");
   }
}

class B extends A {
    void abc() {

        System.out.println("This is b");
        
    }
}

public class overridingeb {
    public static void main(String[] args) {
        B b = new B();
        
        b.abc();
    }
}


