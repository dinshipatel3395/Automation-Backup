package Day5;
//5.Give one example using try, catch and finally block


public class TryCatchFinally 
{
	public static void main(String[] args)
	{
		try
		{
			int i = 50/0;
			System.out.println("First statement in try block");
		}
		catch(ArithmeticException AE)
		{
			System.out.println("you should not divide number with zero");
		}
		finally
		{
		System.out.println("Close");
		}
	}
}
