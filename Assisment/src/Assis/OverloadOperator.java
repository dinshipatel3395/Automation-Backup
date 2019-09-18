

package Assis;

public class OverloadOperator 
{
	String FullName(String firstname,String lastname)
	{
		String FN=firstname.concat(lastname);
		return FN;		
	}
	
	int Sum(int mark1,int mark2)
	{
		int mark=mark1+mark2;
		return mark;
	}
	
	public static void main(String args[])
	{
		OverloadOperator OO=new OverloadOperator();
		String F=OO.FullName("Dirgh"," Patel");
		int S=OO.Sum(30,20);
		
		System.out.println(F);
		System.out.println(S);
	}
}
