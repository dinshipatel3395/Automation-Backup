package Day2;

public class PrimitiveDataTypeValue 
{
	int a=10;
	long b=1010101010;
	byte c=4;
	short d=6;
	float e=(float)10.23;
	double f=10;
	boolean g;
	char h='A';
	String i="Dirgh";
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
		System.out.println(g);
	}
	void charr()
	{
		System.out.println("charr="+h);
	}
	public static void main(String args[]) 
	{
		PrimitiveDataTypeValue PDTV=new PrimitiveDataTypeValue();
		PDTV.booleann();
		PDTV.bytee();
		PDTV.charr();
		PDTV.doublee();
		PDTV.floatt();
		PDTV.intt();
		PDTV.longg();
		PDTV.shortt();	
		PDTV.Stringg();
	}	
}


