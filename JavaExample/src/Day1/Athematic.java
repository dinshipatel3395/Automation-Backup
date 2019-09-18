package Day1;

public class Athematic 
{
	int a=20;
	int b=10;
	int  c;
	void Addition()
	{
		c=a+b;
		System.out.println("Addition="+c);
	}
	void Subtraction()
	{
		c=a-b;
		System.out.println("Subtraction="+c);
	}
	void Multiplication()
	{
		c=a*b;
		System.out.println("Multiplication="+c);
	}
	void Division()
	{
		c=a/b;
		System.out.println("Division="+c);
	}
	public static void main(String args[])
	{
		Athematic ath=new Athematic();
		ath.Addition();
		ath.Subtraction();
		ath.Multiplication();
		ath.Division();
	}	
}


