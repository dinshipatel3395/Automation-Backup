package Day1;

/*public class X 
{
	protected int i = 12;
	//create method here and print i value
	void ReturnX()
	{
		System.out.println("i="+i);
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		//call method here and again print i value here
		X x1=new X();
		x1.ReturnX();
		System.out.println("i="+i);
	}
}*/

class X 
{
	protected static int i = 12;
	//create method here and print i value
	static void x1()
	{
		System.out.println("i="+i);
	}
}
public class MainClass1 
{
	public static void main(String args[])
	{
		//call method here and again print i value here
		X x2=new X();
		x2.x1(); 
		System.out.println("i="+i);
	}
}
