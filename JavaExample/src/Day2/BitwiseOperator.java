package Day2;

public class BitwiseOperator 
{
	public static void main(String args[]) 
	{
		int a=3;
		int b=4;
		System.out.println("And="+(a&b));
		System.out.println("Or="+(a|b));
		System.out.println("XOR="+(a^b));
		System.out.println("Compliment="+(~b));
		System.out.println("Left Shift="+(a<<2));
		System.out.println("Right Shift="+(b>>3));
		System.out.println("Zero Fill Right Shift="+(b>>>3));	
	}
}
