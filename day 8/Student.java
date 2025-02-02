public class Student implements Comparable <Student>
{
	private int id;
	private String name;
	private String city;
	private double score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(int id, String name, String city,double score) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o)
	{
		if (this.score < o.score) 		
			return -1;
			 else if (this.score > o.score)			
			return 1;
			 else
			return 0;
 
	}
	
	}
 
 
 