package Day1;

public class Return 
{
	int a=10;
	int b=20;
	int c;
	void NoReturn()
	{
		c=a+b;
		System.out.println("NoReturn="+c);
	}
	String Return1()
	{
		String name="Dinshi";
		return name;
	}
	public static void main(String args[])
	{
		Return R=new Return();
		R.NoReturn();
		String s =R.Return1();
		System.out.println("Return="+s);
	}
}

