package Day2;

public class AssignmentOperator 
{
	public static void main(String args[]) 
	{
		int a=3;
		int b=4;
		int c;
		int d=4;
		int e=5;
		int f=6;
		int g=10;
		int h=14;
		int i=6;
		int j=3;
		int k=2;
		int l=5;
		int m=8;
		System.out.println("Simple Assignment Operator="+(c=a+b));
		System.out.println("Add and Assignment Operator="+(d+=a));
		System.out.println("Subtract and Assignment Operator="+(e-=b));
		System.out.println("Divide and Assignment Operator="+(f/=b));
		System.out.println("Multiply and Assignment Operator="+(g*=b));
		System.out.println("Modulus and Assignment Operator="+(h%=2));
		System.out.println("Left Shift and Assignment Operator="+(i<<=3));
		System.out.println("Right Shift and Assignment Operator="+(j>>=3)); 
		System.out.println("Bitwise and Assignment Operator="+(k&=b));
		System.out.println("Bitwise exclusive OR and Assignment Operator="+(l^=b));
		System.out.println("Bitwise inclusive OR and Assignment Operator="+(m|=b));
	}
}
