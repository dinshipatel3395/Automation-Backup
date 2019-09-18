package Day1;

public class BankApplication 
{
	int p=5000;
	int r=10;
	int t=5;
	static float m;
	void SimpleInterest()
	{
		m=(float)(p*r*t)/100;
	}
	public static void main(String args[])
	{
		BankApplication BK=new BankApplication();
		BK.SimpleInterest();
		System.out.println("SimpleInterest="+m);
	}
}
