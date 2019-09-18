package Day1;

class X 
{
	protected  int i = 12;
	//create method here and print i value
	static void x1()
	{
		X x2=new X();
		System.out.println(x2.i);
	}
}
public class MainClass 
{
	public static void main(String args[])
	{
		//call method here and again print i value here
		X x2=new X();
		x2.x1();
		
		System.out.println(x2.i);
	}
}