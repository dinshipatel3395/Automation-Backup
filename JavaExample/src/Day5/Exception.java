package Day5;
//4.List out all the exception and give one example.


public class Exception 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]= new int[9];
			System.out.println("try block"+a[6]);
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" ArrayIndexOutOfBoundsException");
		}
	}
}
