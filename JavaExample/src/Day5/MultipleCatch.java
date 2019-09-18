package Day5;
//3.How to Handle multiple catch, give one example


public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[8];
			a[4]= 100/0;
			System.out.println("First Statment in try block");
		} 
		catch(ArithmeticException AE)
		{
			System.out.println("You should not divided a number by zero");
		} 
		catch(ArrayIndexOutOfBoundsException AIOE)
		{
			System.out.println(" ArrayIndexOutOfBoundsException");
		}
		System.out.println( "Other exception");
	}
}
