package Day2;

public class PrimitiveDataType 
{
	int a;
	long b;
	byte c;
	short d;
	float e;
	double f;
	boolean g;
	char h;
	String i;
	void Stringg()
	{
		System.out.println("Stringg="+i);
	}
	void intt()
	{
		System.out.println("intt="+a);
	}
	void longg()
	{
		System.out.println("longg="+b);
	}
	void bytee()
	{
		System.out.println("bytee="+c);
	}
	void shortt()
	{
		System.out.println("shortt="+d);
	}
	void floatt()
	{
		System.out.println("floatt="+e);
	}
	void doublee()
	{
		System.out.println("doublee="+f);
	}
	void booleann()
	{
		System.out.println("booleann="+g);
	}
	void charr()
	{
		System.out.println("charr="+h);
	}
	public static void main(String args[]) 
	{
		PrimitiveDataType PDT=new PrimitiveDataType();
		PDT.booleann();
		PDT.bytee();
		PDT.charr();
		PDT.doublee();
		PDT.floatt();
		PDT.intt();
		PDT.longg();
		PDT.shortt();
		PDT.Stringg();
	}	
}
