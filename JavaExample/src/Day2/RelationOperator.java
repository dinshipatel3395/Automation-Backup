package Day2;

public class RelationOperator 
{
	int a=30;
	int b=60;
	void EqualTo()
	{
		System.out.println("EqualTo="+(a==b));
	}
	void NotEqualTo()
	{
		System.out.println("NotEqualTo="+(a!=b));
	}
	void GreaterThan()
	{
		System.out.println("GreaterThan="+(a>b));
	}
	void LessThan()
	{
		System.out.println("LessThan="+(a<b));
	}
	void LessThanOrEqualTo()
	{
		System.out.println("LessThanOrEqualTo="+(a<=b));
	}
	void GreaterThanOrEqualTo()
	{
		System.out.println("GreaterThanOrEqualTo="+(a>=b));
	}
	public static void main(String args[]) 
	{
		RelationOperator RO=new RelationOperator();
		RO.EqualTo();
		RO.NotEqualTo();
		RO.GreaterThan();
		RO.LessThan();
		RO.LessThanOrEqualTo();
		RO.GreaterThanOrEqualTo();
	}
}
