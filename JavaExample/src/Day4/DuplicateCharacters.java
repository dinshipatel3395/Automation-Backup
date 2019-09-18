package Day4;

public class DuplicateCharacters 
{
	public static void main(String[] args)
	{
		String a="nayan";
		char x[]=a.toCharArray();
		int i;
		int j;
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[i]);
					
					
				}
			
			}
		}
	}
}
