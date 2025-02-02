
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 
public class StudentImpl {
 
	public static List<Student> getList()
	{
		List<Student> l1 = new ArrayList<Student>();
		
	 l1.add(new Student(111,"Sudhir","pune",90.0));
	 l1.add(new Student(222,"Karthik","Tamilnadu",92.8));
	 l1.add(new Student(333,"piyush","chatisgarh",91.0));
	 l1.add(new Student(444,"Dhruv","Delhi",89.0));	
	 l1.add(new Student(555,"Yash","Delhi",88.0));
	 l1.add(new Student(666,"Shiva","AP",98.8));
	 l1.add(new Student(777,"Sai","AP",93.6));
	return l1;
	}
	
	public static List<Student> getCity(String city)
	{
		List<Student> l2 = getList();
		List<Student> l3= new ArrayList();
		for(Student m : l2)
		{
			if(m.getCity().equals(city))
				l3.add(m);			
		}
		
		return l3;
	}
	public static void sorting()
	{
		List<Student> l3 = getList();
		System.out.println("Sorting Based on Scores - ");
		Collections.sort(l3);
		for(Student s: l3)
		System.out.println(s.getName()+ " "+s.getScore());
		
		Comparator<Student> com2 = new StudentBasedName();
	      Collections.sort(l3,com2);
 
	        System.out.println("Sorting Based on Name- ");
	        for(Student stud:l3) {
	            System.out.println(stud.getName());
	        }
	        Comparator<Student> com3 = new StudentCityBased();
		      Collections.sort(l3,com3);
 
		        System.out.println("Sorting Based on City - ");
		        for(Student stud:l3) {
		            System.out.println(stud.getName()+" "+ stud.getCity());
		        }
	        
 
		
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String city = sc.nextLine();
		System.out.println("List OF Students : "+(getList()));
		
		System.out.println("List Of Student Based on City entered : "+getCity(city));
		sorting();
 
 
	}
 
}
 
 