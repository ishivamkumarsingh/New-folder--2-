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

class C extends B {
    void pqr() {
        System.out.println("This is c");
    }

}

public class Multi {
   
    public static void main(String[] args) {
        C c = new C();
        
        c.abc();
        c.xyz();        
        c.pqr();
    }
    
}
