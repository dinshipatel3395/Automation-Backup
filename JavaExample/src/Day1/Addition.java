package Day1;

public class Addition 
{
	static int a=10;
	static int b=20;
	static int  c;
	static float d;
	static void addition()
	{
		 c=a+b;
		 System.out.println(c);
	}
	static void Subtraction()
	{
		 c=a-b;
		 System.out.println(c);		
	}
	static void Multiplication()
	{
		 c=a*b;
		 System.out.println(c);
	}
	static void Division()
	{
		 d=(float)a/b;
		 System.out.println(d);
	}
	public static void main(String args[])
	{
		addition();
		Subtraction();
		Multiplication();
		Division();	
	}	
}
