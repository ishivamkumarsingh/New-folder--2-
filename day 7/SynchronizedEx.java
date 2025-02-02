class Multiplication
{
	public synchronized void multiply(int x)
	{
		for(int i= 1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			
			System.out.println(x+ "*"+i+ "= "+x*i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Multiplication ob;
	public Thread1(Multiplication ob1)
	{
	this.ob = ob1;	
	}
	public void run()
	{
		ob.multiply(5);
	}
}
class Thread2 extends Thread
{
	Multiplication ob;
	public Thread2(Multiplication ob1)
	{
	this.ob = ob1;	
	}
	public void run()
	{
		ob.multiply(10);
	}
}
class Thread3 extends Thread
{
	Multiplication ob;
	public Thread3(Multiplication ob1)
	{
	this.ob = ob1;	
	}
	public void run()
	{
		ob.multiply(15);
	}
}
 
public class SynchronizedEx {
 
	public static void main(String[] args) {
		Multiplication ob = new Multiplication();
Thread1 t1 = new Thread1(ob);
Thread2 t2 = new Thread2(ob);
Thread3 t3 = new Thread3(ob);
t1.start();
t2.start();
t3.start();
 
 
 
	}
 
}
 
 