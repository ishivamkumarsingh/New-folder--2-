import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    
    String name;
    int emp_id;
    float salary;

    Employee(String n, int m, float g) {
        this.name = n;
        this.emp_id = m;
        this.salary = g;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.emp_id, other.emp_id);
    }

    public static void show(List<Employee> abc) {
        for (Employee e : abc) {
            System.out.println(e.name + " " + e.emp_id + " " + e.salary);
        }
    }

    public static void sort(List<Employee> abc) {
        abc.sort(Comparator.comparingDouble(e -> e.salary));
    }

    public static void name(List <Employee> abc){
        abc.sort(Comparator.comparing(e -> e.name)); 
    }
    public  static void match(List<Employee> abc, String name){
        for(Employee e: abc){
         if(name.equals(e.name)) {
             System.out.println("Employee found: " + e.name + " " + e.emp_id + " " + e.salary);
         }
        }
        
    }
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        
        
        emp.add(new Employee("s43g1", 123, 22455.55f));
        emp.add(new Employee("svfrr2", 124, 22455.59f));
        emp.add(new Employee("sreabr3", 125, 22455.57f));
        emp.add(new Employee("serabe4", 126, 22455.55f));

      
        
     
      
      match(emp,"svfrr2");
      show(emp);

    }
}
