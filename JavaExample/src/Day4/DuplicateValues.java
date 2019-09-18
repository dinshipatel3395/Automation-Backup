//4.WAP to find the duplicate values of an array of integer values.{5,2,2,5,7,4}
package Day4;

public class DuplicateValues 
{
	public static void main(String[] args)
	{
		int x[]={5,2,2,5,7,4};
		int i;
		for(i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			if(x[i]==x[j])
			{
				System.out.println(x[i]);
			}
		}
	}
}
